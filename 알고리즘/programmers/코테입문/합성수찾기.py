'''
약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 
solution 함수를 완성해주세요.
'''

import sys
from collections import deque

n = int(sys.stdin.readline().strip())
answer = [0 for _ in range(101)]
answer[4] = 1

def solution(n):
    global answer
    for i in range(4, n+1):
        cnt = 0
        for j in range(1, i+1):
            if (answer[i//j] == 1) & (i%j == 0):
                answer[i] = 1
                break
            else:
                if i%j == 0:
                    cnt+=1
                if cnt >= 3:
                    answer[i] = 1
                    break
                
        
    return answer[:n+1]

print(
    solution(n)
)