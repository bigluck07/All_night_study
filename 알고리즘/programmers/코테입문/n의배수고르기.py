'''
정수 n과 정수 배열 numlist가 매개변수로 주어질 때, 
numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 
solution 함수를 완성해주세요.
'''

import sys

n = int(sys.stdin.readline().strip())
numlist = list(map(int, sys.stdin.readline().strip().split()))

def solution(n, numlist):
    answer = []
    for i in numlist:
        if i%n == 0:
           answer.append(i) 
    return answer

print(
    solution(n, numlist)
)