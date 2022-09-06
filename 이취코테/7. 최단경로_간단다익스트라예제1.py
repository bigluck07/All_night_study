'''
예제코드 1
- 간단다익스트라

가로n 세로2인 직사각형을 1*2, 2*1, 2*2의 덮개를 이용해 채우려고 한다,
바닥을 채우는 모든 경우의 수를 구하시오

- 예시
6 11
1
1 2 2
1 3 5
1 4 1
2 3 3
2 4 2
3 2 3
3 6 5
4 3 3
4 5 1
5 3 1
5 6 2

->	0
	2
	3
	1
	2
	4 


- 입력조건
	- 첫째 줄: 노드 개수 v, 간선 개수 e 가 공백을 기준으로 입력(정수)
	- 
                
- 출력조건
직사각형을 채우는 모든 경우의 수를 796,796로 나눈 나머지 값을 출력한다

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
      

start_time = time.time()
import sys
input = sys.stdin.readline

INF = int(1e9) # 무한을 의미 -> 10억 설정

# 노드, 간선 개수
n,m = map(int, input().rstrip().split())
#시작 노드
start = int(input())
# 노드 별 연결 정보 담을 리스트
graph = [[] for i in range(n+1)]
# 방문확인 리스트
visited = [False]*(n+1)
# 최단거리 테이블 초기화
distance = [INF] * (n+1)
path = [[] for i in range(n+1)]

# 모든 간선 정보 입력
for _ in range(m):
	a,b,c = map(int, input().rstrip().split()) # a->b 는 c비용
	graph[a].append((b,c))

# 미방문 노드 중 최단 거리가 가장 짧은 노드 번호 선택
def get_smallest_node():
	min_value = INF
	index = 0 # 선택할 노드(인덱스)
	for i in range(1, n+1):
		if distance[i] < min_value and not visited[i]:
			min_value = distance[i]
			index = i
	return index

def dijkstra(start):
    # 시작 노드 초기화
    distance[start] = 0
    visited[start] = True
    
    for j in graph[start]:
        distance[j[0]] = j[1]
        path[j[0]]+=[j[0]]
    
    #시작 노드 제외 전체 n-1개 노드에 대해 반복
    for i in range(n-1):
        # 현재 최단 거리가 가장 짧은 노드 꺼내 방문처리
        now = get_smallest_node()
        if not now in path[now]:
            path[now] = [now]
            visited[now] = True
        # 현재 노드와 연결된 노드 확인
        for j in graph[now]:
            cost = distance[now] + j[1]
            # 현재노드 -> 다른노드 최단거리가 짧아지는 경우
            if cost < distance[j[0]]:
                distance[j[0]] = cost
                path[j[0]] = path[now]+[j[0]]
 

# 다익스트라 실행
dijkstra(start)

# 모든 노드로 가기 위한 최단거리 출력
for i in range(1, n+1):
	# 도달 불가 시 무한 출력
	if distance[i] == INF:
		print("무한")
	# 도달 가능시 거리 출력
	else:
		print(distance[i])
print(path)

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')