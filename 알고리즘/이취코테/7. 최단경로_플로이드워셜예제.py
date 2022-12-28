'''
예제코드 3
- 플로이드워셜


- 예시
4 7
1 2 4
1 4 6
2 1 3
2 3 7
3 1 5
3 4 4 
4 3 2

->	0  4 8 6
	3  0 7 9
	5  9 0 4
	7 11 2 0


- 입력조건
	- 첫째 줄: 노드 개수 n, 간선 개수 m 가 공백을 기준으로 입력(정수)

                
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

n,m = map(int, input().rstrip().split()) # 노드, 간선 개수
graph = [[INF] * (n+1) for _ in range(n+1)] # 노드 별 연결 정보 담을 2차원 리스트
path = [[[] for _ in range(n+1)] for _ in range(n+1)] # 경로 담을 3차원 리스트

# 자기자신의 거리 0
for x in range(1, n+1):
    graph[x][x] = 0
    path[x][x] = [x]

# 모든 간선 정보 입력
for _ in range(m):
    a,b,c = map(int, input().rstrip().split()) # a->b 는 c비용
    graph[a][b] = c
    path[a][b] = [a,b]
 
comp = copy.deepcopy(graph)
for k in range(1, n+1): # 점화식에 따른 플로이드 워셜 수행
    print(path)
    for x in range(1, n+1):
        for y in range(1, n+1):
            # if graph[x][y] != INF and x!=y:
            #     path[x][y]=[x,y]
            temp = graph[x][y]
            graph[x][y] = min(graph[x][y], graph[x][k] + graph[k][y])
            if temp!=graph[x][y]:
                # path[x][y]+=[k]
                path[x][y] = path[x][k]+path[k][y][1:] #멍청이



# 수행결과 출력
for x in range(1, n+1):
	for y in range(1, n+1):
		# 도달 불가 시 '무한'출력
		if graph[x][y] == INF:
			print('무한')
		else:
			print(graph[x][y], end=' ')
	print()
 
print(path)

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
'''
[
    [[], [], [], [], []], 
    [[], [1], [1, 2], [1, 4, 3], [1, 4]], 
    [[], [2, 1], [2], [2, 3], [2, 1, 4]], 
    [[], [3, 1], [3, 1, 2], [3], [3, 4]], 
    [[], [4, 3, 1], [4, 3, 1, 2], [4, 3], [4]]
    ]
'''