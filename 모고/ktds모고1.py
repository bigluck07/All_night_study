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