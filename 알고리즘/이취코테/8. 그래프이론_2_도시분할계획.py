'''
문제 2 - 도시 분할 계획 **
- 풀이 40분, 시간제한 2초, 메모리제한 256MB, 기초 문제집

마을은 n개의 집과 m개의 양방통행길로 구성되며 길마다 유지비가 든다.
해당 마을은 2개의 분리된 마을로 만드려고 할 때, 
분리된 마을 안에 집들이 서로 연결되어 있어야 하며(분리된 마을 안 임의의 두 집 사이에 경로가 항상존재)
마을에는 하나 이상의 집이 있어야 한다. 
그리고 분리된 마을끼리의 경로는 없앨 수 있으며, 마을 안 연결되어 있는 집의 중복경로 또한 제거가능하다.



- 입력조건
	- 첫째 줄: n,m (2 <= n <= 100,000, 1 <= m <= 1,000,000)
    - 둘째 줄 ~ m+1째 줄: m개의 정보(a,b,c)
        - a집과 b집이 연결된 도로 유지비 c(1 <= c <= 1,000)
                
- 출력조건
유지비 합의 최솟값

- 예시
7 12
1 2 3
1 3 2
3 2 1
2 5 2
3 4 4
7 3 6
5 1 5
1 6 2
6 4 1
6 5 3
4 5 3
6 7 4

->  8
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

n, m = map(int, sys.stdin.readline().rstrip().split()) # 노드, 간선의 개수 입력
edges = [list(map(int, sys.stdin.readline().rstrip().split())) for i in range(m)] # 간선 내용 a,b,c
start_time = time.time()

def find_parent(parent, x): # 루트노드 찾기
	if parent[x] != x:
		parent[x] = find_parent(parent, parent[x])
	return parent[x]

def union_parent(parent, a, b): # 두 원소 집합 합치기
	a = find_parent(parent, a)
	b = find_parent(parent, b)
	if a < b:
		parent[b] = a
	else:
		parent[a] = b


result = 0 # 최종비용
cycle = False

parent = [0] * (n+1) # 부모노드 생성 및 자기자신 포인팅

for i in range(1, n+1):
    parent[i] = i

edges.sort(key=lambda x: x[2]) # 비용순으로 정렬
biggist = 0 # 최소 신장트리의 간선 중 가장 큰 놈


for edge in edges:
    a,b,cost = edge
    print(a,b,cost)
    if find_parent(parent, a) != find_parent(parent, b):
        union_parent(parent, a, b)
        result += cost
        biggist = cost

print(parent)

print(result)

print(result - biggist)

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
