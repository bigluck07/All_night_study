'''
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 
solution 함수를 완성해주세요
'''

import sys

n = int(sys.stdin.readline().strip())


def solution(n):
    answer = 0
    for i in str(n):
        answer+=int(i)
    return answer

print(
    solution(n)
)