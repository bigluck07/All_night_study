'''
어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
정수 n이 매개변수로 주어질 때, 
n이 제곱수라면 1을 아니라면 2를 return하도록 
solution 함수를 완성해주세요.
'''

import sys

n = 144

def solution(n):
    answer = 1
    if (n**(1/2))%1 == 0:
        return answer
    answer+=1
    return answer

print(
    solution(n)
)