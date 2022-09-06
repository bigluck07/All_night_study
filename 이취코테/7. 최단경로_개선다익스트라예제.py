import sys
import heapq
input = sys.stdin.readline
INF = int(1e9) # 무한을 의미 -> 10억 설정


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
for _ in range(n):
	a,b,c = map(int, input().rstrip().split()) # a->b 는 c비용
	graph[a].append((b,c))

def dijkstra(start):
	q = []
	# 시작 노드 경로 0으로 큐에 삽입
	heapq.heappush(q, (0, start))
	distance[start] = 0
	
	while q: # 큐에 들어있으면 반복
		# 최단거리가 가장 짧은 노드 꺼내기
		dist, now = heapq.heappop(q)
		# 현재 노드가 이미 처리 되었으면 무시
		if distance[now] < dist:
			continue
		# 현재 노드의 인접 노드 확인
		for i in graph[now]:
			cost = dist+i[1]
			# 현재노드를 거치는게 더 짧은 경우
			if cost < distance[i[0]]:
				distance[i[0]] = cost
				heapq.heappush(q, (cost, i[0]))
                path[i[0]] = path[now]+path[i[0]]


# 다익스트라 실행
dijkstra(start)

# 모든 노드로 가기 위한 최단거리 출력
for i in range(1, n+1):
	# 도달 불가 시 '무한' 출력
	if distance[i] == INF:
		print("무한")
	# 도달 가능시 거리 출력
	else:
		print(distance[i])