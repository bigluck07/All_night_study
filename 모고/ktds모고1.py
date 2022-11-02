'''
앞에서부터 읽을 때와 뒤에서부터 읽을 때 똑같은 단어를팰린드롬(palindrome)이라고 합니다. 예를들어서racecar, 10201은 팰린드롬 입니다.
두 자연수 n, m이 매개변수로 주어질 때, n 이상 m 이하의 자연수 중 팰린드롬인 숫자의 개수를 return 하도록solution 함수를 완성해 주세요.

제한사항
m은 500,000이하의 자연수이며, n은 m 이하의 자연수입니다.

입출력 예
n   m   result
1   100 18
100 300 20
'''
memo = [1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99]
def solution(n,m):
    answer = 0
    for i in range(n, m+1):
        if i in memo:
           answer+=1
           continue
       
        state = True
       
        if len(str(i))%2 > 0:
            for j in range(len(str(i))//2):
                if str(i)[j] == str(i)[-(j+1)]:
                    continue
                else:
                    state = False
                    break
                
        else:
            for j in range(len(str(i))//2):
                if str(i)[j] == str(i)[-(j+1)]:
                    continue
                else:
                    state = False
                    break
                
        if state:
            memo.append(i)
            answer+=1
    return answer