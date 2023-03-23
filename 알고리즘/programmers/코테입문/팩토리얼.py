'''
팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미
정수 n이 주어질 때 i! ≤ n을 만족하는 가장 큰 정수 i를 return 하도록 
solution 함수를 완성해주세요.
'''

import sys
import math

n = int(sys.stdin.readline().strip())

arr = [0 for _ in range(11)]

def solution(n):
    answer = 0
    for i in range(11):
        arr[i] = math.factorial(i)
        print(i, arr[i])
        if arr[i] > n:
            answer = i-1
            break
        else:
            answer=i
    return answer


print(
    solution(n)
)