'''
s: 영어 소문자 문자열

s에서 같은 문자가 2개 이상 연속되는 경우 해당 구간을 기점으로 분할 해 
차례로 배열에 담아 return 하는 프로그램을 작성하시오.

단, 'aabbb'같이 여러 구간('aa','bbb')이 일렬로 이어진 것은 각각 하나의 구간으로 취급
s = 'aabbb'라면, 정답은 ['', '']임

1<= s <= 1,000


예
pizza -> pi, a
mississippi -> mi i i i
aabcddddefggg -> "" bc ef ""
abyyy -> ab, ""
kkkkkk -> "",""

ddfdrggmmasmme
['', 'fdr', 'as', 'e']
'''

def solution(s):
    answer = []
    result = ""
    contiguous_current_word = s[0]  #a
    contiguous_cnt = 0
    for idx in range(len(s)):
        if s[idx] == contiguous_current_word:  #연속이 지속되는 경우라면
            contiguous_cnt += 1
        else:  # 연속이 깨지는 경우라면
            if contiguous_cnt == 1: # 연속되지 않는 경우
                result += contiguous_current_word
            else: # 연속된 경우
                if len(result) > 0:
                    answer.append(result)
                    result = ""
                if idx == contiguous_cnt:
                    answer.append(result)
                
                
            # 연속되는 문자 현재 값으로 세팅
            contiguous_current_word = s[idx]
            contiguous_cnt = 1  # 문자 한개만 있어도 연속 값은 1임
    # 마지막 문자열확인 결과 입력
    if len(result) > 0:
        answer.append(result)
        result = ""
    if contiguous_cnt == 1:
        result += contiguous_current_word
        answer.append(result)
        
    elif len(s) == contiguous_cnt:
        answer.append("")
        answer.append("")
    else: 
        answer.append("")
        
    return answer
    
    
s = input().rstrip()

print(solution(s))



        # if s[i-1] == s[i]:
        #     now+=1
        #     if len(temp) > 0:
        #         answer.append(temp)
        #         temp = ""
        #     if i == now:
        #         answer.append("")
        #         break
        #     continue
        # else:
        #     temp+=s[str:now]
        #     str+=1
        #     now+=1
        #     if len(temp) > 0:
        #         if i == now:
        #             answer.append(temp)
        #             temp = ""
        #             answer.append(s[i])
        #             break
        #     if now-str > 1:
        #         answer.append("")
        #         str,now = now, now+1