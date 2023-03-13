'''
브루트포스_비밀번호 - 실3
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	64 MB	1730	650	508	44.212%

문제
웅찬이는 근성이 대단한 도둑이다. 그래서 금고를 털 때, 모든 조합을 눌러본다. 
예를 들어 비밀번호가 3글자 라는 사실을 알 때 
000, 001, 002, 003, … 998, 999의 모든 조합을 눌러본다. 

그러나 웅찬이는 선견지명이 있어서 비밀번호에 어떤 숫자가 들어가는지 일부 알 수 있다. 
예를 들어 3글자 비밀번호에 0이 들어감을 안다면 999 와 같이 0이 들어가지 않는 수는 가능성이 없다.
그러나 000, 012, 030과 같은 수는 가능하다. 
비밀번호의 길이와 선견지명으로 알게된 비밀번호의 일부 숫자가 주어질 때, 
모든 가능한 비밀번호의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄: 비밀번호의 길이 n (1 ≤ n ≤ 7), 선견지명으로 알게된 비밀번호에 들어가는 수 m(0 ≤ m ≤ n) 
둘째 줄: m개의 서로 다른 숫자(0~9) 단, m이 0인 경우 둘째 줄은 주어지지 않는다.

출력
가능한 모든 비밀번호의 개수를 출력한다.

예제 입력 1 
2 1
7
예제 출력 1 
19

예제 입력 2 
2 2
3 4
예제 출력 2 
2

힌트
첫 번째 예제의 경우 가능한 비밀번호의 조합은 07, 17, 27, 37, 47, 57, 67, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 87, 97이다. 
두 번째 예제의 경우 가능한 비밀번호의 조합은 34, 43이다.

https://codedrive.tistory.com/406 # 수학적으로 풀 수 있음
'''

# import sys, copy
# import time
# import math

# n, m = map(int, sys.stdin.readline().strip().split())

# def cntSol(n,m):
#     if m > 0:
#         mLsCnt = len(list(map(int, sys.stdin.readline().strip().split())))

#         if (n-m) > 0:
#             res = 10**(n-m)
#             res+= (math.factorial(m) * 10) -1
#         else:
#             res=(math.factorial(m))

#         return res
#     else:
#         return 10**n

import sys
n, m = map(int, sys.stdin.readline().strip().split())
    
if m!=0:
    nums = list(map(int, sys.stdin.readline().strip().split()))
else:
    nums = []
    
def dfs(pw):
    if len(pw) == n:
        if all(map(lambda num: num in pw, nums)):
            return 1
        else: 
            return 0
    res = 0
    for i in range(10):
        pw.append(i)
        res+=dfs(pw)
        pw.pop()
    return res

print(dfs([]))


import sys
def is_val(pw):
    return all(map(lambda num: num in pw, nums))

def dfs(pw):
    if len(pw) == n:
        return 1 if is_val(pw) else 0
    res = 0
    for i in range(10):
        pw.append(i)
        res += dfs(pw)
        pw.pop()
    return res
def solution():
    ans = dfs([])
    return ans

n, m = map(int, sys.stdin.readline().strip().split())
nums = list(map(int, sys.stdin.readline().strip().split())) if m!=0 else []
print(solution())