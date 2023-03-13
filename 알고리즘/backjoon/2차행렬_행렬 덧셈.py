'''
행렬 덧셈
문제
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬의 크기 N 과 M이 주어진다. 
둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 
이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. 
N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

예제
3 3
1 1 1
2 2 2
0 1 0
3 3 3
4 4 4
5 5 100

답
4 4 4
6 6 6
5 6 100
'''

import sys, copy
import time
# import psutil
import numpy as np

# def memory_usage(message: str = 'debug'):
#     # current process RAM usage
#     p = psutil.Process()
#     rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
#     print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n,m = map(int, sys.stdin.readline().rstrip().split())

# a = np.array([[0]*m]*n)
# b = np.array([[0]*m]*n)

# start_time = time.time()

# for i in range(n):
#     a[i] = list(map(int, sys.stdin.readline().rstrip().split()))

# for i in range(n):
#     b[i] = list(map(int, sys.stdin.readline().rstrip().split()))

# res = a+b
# for i in range(n):
#     print(*res[i])

import sys
n,m = map(int, sys.stdin.readline().rstrip().split())

a, b = [[]*m]*n, [[]*m]*n
for i in range(n):
    a[i] = list(map(int, sys.stdin.readline().rstrip().split()))

for i in range(n):
    b[i] = list(map(int, sys.stdin.readline().rstrip().split()))

for i in range(n):
    for j in range(m):
        a[i][j]+=b[i][j]

for i in range(n):
    print(*a[i])
    
end_time = time.time()

# print(end_time-start_time)



'''

26

-> 3
'''