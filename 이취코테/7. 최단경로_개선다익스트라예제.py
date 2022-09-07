'''
예제코드 2
- 개선된 다익스트라


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


'''
import sys, copy, heapq, time, psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
input = sys.stdin.readline
INF = int(1e9) # 무한을 의미 -> 10억 설정
start_time = time.time()

# 노드, 간선 개수
n,m = map(int, input().rstrip().split())
#시작 노드
start = int(input())
# 노드 별 연결 정보 담을 리스트
graph = [[] for i in range(n+1)]
# 방문확인 리스트
visited = [[False] * (n+1)]
# 최단거리 테이블 초기화
distance = [INF] * (n+1)
path = [[] for i in range(n+1)]

# 모든 간선 정보 입력
for _ in range(m):
	a,b,c = map(int, input().rstrip().split()) # a->b 는 c비용
	graph[a].append((b,c))

def dijkstra(start):
    q = [] # 시작 노드 경로 0으로 큐에 삽입
    heapq.heappush(q, (0, start))
    distance[start] = 0
    while q: # 큐에 들어있으면 반복 
        dist, now = heapq.heappop(q) # 최단거리가 가장 짧은 노드 꺼내기
        if distance[now] < dist: # 현재 노드가 이미 처리 되었으면 무시
            continue
        for i in graph[now]: # 현재 노드의 인접 노드 확인
            cost = dist+i[1]
            if cost < distance[i[0]]: # 현재노드를 거치는게 더 짧은 경우
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))
                path[i[0]] = path[now]+path[i[0]]


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