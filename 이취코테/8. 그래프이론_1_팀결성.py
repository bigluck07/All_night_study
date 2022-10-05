'''
문제 1 - 팀결성 **
- 풀이 20분, 시간제한 2초, 메모리제한 128MB, 핵심 유형

학생 0~n번이 개별 팀으로 구분되어 총 n+1개의 팀이 존재한다.
이때 '팀 합치기' 연산과 '같은 팀 여부 확인' 연산을 사용할 수 있을 때,
M개의 연산을 수행해 같은 팀 여부 확인 연산에 대한 연산 결과를 출력하는 프로그램을 만드시오

'팀 합치기' 연산
    - 두 팀을 합치는 연산
    - 0 a b 형태로 입력
    - a학생의 팀과 b학생의 팀을 합침
'같은 팀 여부 확인' 연산
    - 특정 두 학생이 같은 팀인지 확인하는 연산
    - 1 a b 형태로 입력
    - a학생과 b학생의 동일팀 여부 확인

- 입력조건
	- 첫째 줄: n,m (1 <= n,m <= 100,000)
    - 둘째 줄 ~ m+1째 줄: m개의 연산
        - 연산은 위 설명과 동일한 입력 조건을 가지며 a,b는 n 이하의 정수
                
- 출력조건
같은 팀 여부 확인 연산에 대해 한 줄에 하나씩 YES, NO 로 출력

- 예시
7 8
0 1 3
1 1 7
0 7 6
1 7 1
0 3 7
0 4 2
0 1 1
1 1 1

->  No
    No
    YES
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
arr = [list(sys.stdin.readline().rstrip().split()) for i in range(m)]
start_time = time.time()

print(arr)

p = [0] * (n+1)

for i in range(m):
    p[i] = i

def find_p(p, x): # 루트노드 찾기
    answer = []
    if p[x] != x:
        p[x] = find_p(p, p[x])
    return p[x]

def union_p(p, a, b):
    answer = []
    a = find_p(p, a)
    b = find_p(p, b)
    if a < b:
        p[b] = a
    else:
        p[a] = b

# 연산확인
for i in arr:
    order, a, b = map(int, i)
    print(p)
    if order == 0: # 합치기 연산
        union_p(p, a,b)
    elif order == 1: # 확인 연산
        if find_p(p, a) == find_p(p,b):
            print('YES')
        else:
            print('NO')

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
