'''
문제 4 - 효율적인 화폐 구성
- 풀이 30분, 시간제한 1초, 메모리제한 128MB

n가지 화폐를 최소한으로 이용해 화폐 가치의 합이 m인 경우를 구하고자 한다.
최소한의 화폐를 사용한 경우의 화폐 개수 총합을 출력하라

- 예시
2 15
2
3

-> 5


3 4
3 
5
7
-> -1


- 입력조건
	- 첫째 줄: n,m (1 <= n <= 100, 1<= m <= 10,000)
    - 둘째 줄 ~ n+1째 줄: 화폐 종류(1 <= K <= 10,000)
                
- 출력조건
화폐의 개수가 최소인 경우의 화폐 개수의 총합

'''

import sys, copy
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n, m = map(int, sys.stdin.readline().rstrip().split())
arr = [int(sys.stdin.readline().rstrip()) for i in range(n)]
start_time = time.time()

res = [0]+[m+1]*max(max(arr),m)

def dynamic_prog(money_cnt, total, money_ls):
    for i in range(money_cnt): # 화폐 종류 돌리기
        for j in range(money_ls[i], total+1): # 화폐 이상 값부터 목표값까지 돌리기
            if res[j-money_ls[i]] != m+1: # 현재값에서 현재 선택한 화폐를 뺀 값이 나눠 떨어지면 재사용함(x1+y == x2)
                res[j] = min(res[j], res[j-money_ls[i]]+1) # 이미 존재하는 값과 현재 화폐의 종류 값을 뺀 현재값 
                print(res)
                
    if res[total] == m+1:
        return -1
    else:
        return res[total]
    
res2 = [0]*(m+1)
for i in arr:
    if i <= m:
        res2[i] = 1

def dynamic_prog2(money_cnt, total, money_ls):
    if res2[total] != 0: # 메모이제이션에 있다면 출력
        return res2[total]
    
    else:                # 메모이제이션에 없다면
        a = []
        for i in money_ls: # 화폐종류 for문
            if total-i > 0 :
                b = dynamic_prog2(money_cnt, total-i, money_ls) # 목표값-화폐
                if b > 0:
                    a.append(b)

        if len(a) >= 1:
            res2[total] = min(a)+1
        else:
            res2[total] = -1
        return res2[total]


# print("정답:", dynamic_prog(n, m, arr))
ans = dynamic_prog2(n, m, arr)

print(res2)
if ans > 0:
    print("정답:", ans)
else:
    print("정답:", -1)
    
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
2 15
2
3

-> 5


3 4
3 
5
7
-> -1
'''