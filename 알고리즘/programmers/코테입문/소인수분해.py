'''
소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것
자연수 n이 매개변수로 주어질 때 
n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
'''

import sys, re
import math

n = int(sys.stdin.readline().strip())
prime_num = [0 for _ in range(10001)]

def is_prime_num(x):
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True

def solution(n):
    global prime_num
    answer = []
    temp = n
    prime_num[2] = 1
    while True:
        for i in range(2, n+1):
            if prime_num[i] == 1:
                if temp%i == 0:
                    answer.append(i)
                    temp = temp//i
                    break
                
            if is_prime_num(i):
                prime_num[i] = 1
                if temp%i == 0:
                    answer.append(i)
                    temp = temp//i
                    break
            else:
                pass

        if temp == 1:
            answer = list(sorted(set(answer)))
            return answer
        
        if i == n:
            return -1
    return answer


print(
    solution(n)
)
