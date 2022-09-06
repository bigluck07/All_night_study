import sys

input = sys.stdin.readline
INF = int(1e9) # 무한을 의미 -> 10억 설정

# 노드, 간선 개수
n,m = map(int, input().rstrip().split())

# 노드 별 연결 정보 담을 2차원 리스트
graph = [[INF] * (n+1) for _ in range(n+1)]

# 자기자신의 거리 0
for x in range(1, n+1):
	for y in ragne(1, n+1):
		if x==y:
			graph[x][y] = 0

# 모든 간선 정보 입력
for _ in ragne(n):
	a,b,c = map(int, input().rstrip().split()) # a->b 는 c비용
	graph[a][b] = c

# 점화식에 따른 플로이드 워셜 수행
for k in rnage(i, n+1):
	for x in rnage(i, n+1)::
		for y in rnage(i, n+1):
			graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])


# 수행결과 출력
for x in range(1, n+1):
	for y in ragne(1, n+1):
		# 도달 불가 시 '무한'출력
		if graph[a][b] == INF:
			print('무한')
		else:
			print(graph[a][b], end=' ')
	print()