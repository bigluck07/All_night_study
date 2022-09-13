'''
문제 1 - 미래도시
- 풀이 40분, 시간제한 1초, 메모리제한 128MB, 기출 M기업 코테

공중미래도시 1~n까지의 회사 중 특정 회사들은 서로 도로를 통해 연결되어 있다. 현재 1번 회사에서 X번 회사로 방문하려고 한다.
연결된 도시는 양방향 이동이 가능하며, 도로로 가면 1만큼의 시간으로 이동이 가능하다.
또한,X번 회사로 가기전 K번 회사를 들렸다 간다고 한다. 즉 1->K->X 가 목표다.
이때 최소 이동 시간을 계산하는 프로그램을 작성하시오.

- 예시
5 7
1 2
1 3
1 4
2 4
3 4
3 5
4 5
4 5

-> 3

4 2
1 3
2 4
3 4
-> -1



- 입력조건
	- 첫째 줄: 전체회사 개수n, 도로 수 m 이 공백으로 구분되어 주어짐(1<=n,m<=100)
	- 둘째 줄 ~ m+1째 줄: 연결된 두 회사의 번호가 공백으로 구분되 주어짐
    - m+2번째 줄: 도착지x, 경유지k 가 공백을 구분되어 주어짐 (1<=k<=100)
                
- 출력조건
1번 회사에서 출발해 k번을 들리고 x번 회사로 가능 최단 시간을 구하시오
만약 x번 회사에 도달이 불가능 하면 -1을 출력한다

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

n,m = map(int, input().rstrip().split()) # 노드 수, 간선 수
graph = [[INF] * (n+1) for _ in range(n+1)] # 노드 별 연결 정보 담을 2차원 리스트
path = [[[] for _ in range(n+1)] for _ in range(n+1)] # 경로 담을 3차원 리스트

# 자기자신의 거리 0
for x in range(1, n+1):
    graph[x][x] = 0
    path[x][x] = [x]

# 모든 간선 정보 입력
for _ in range(m):
    a,b = map(int, input().rstrip().split()) # a->b 는 c비용
    graph[a][b] = 1
    path[a][b] = [a,b]
    graph[b][a] = 1
    path[b][a] = [b,a]

dst,gtw = map(int, input().rstrip().split())

for k in range(1, n+1): # 점화식에 따른 플로이드 워셜 수행
    for x in range(1, n+1):
        for y in range(1, n+1):
            # if graph[x][y] != INF and x!=y:
            #     path[x][y]=[x,y]
            temp = graph[x][y]
            graph[x][y] = min(graph[x][y], graph[x][k] + graph[k][y])
            if temp!=graph[x][y]:
                # path[x][y]+=[k]
                path[x][y] = path[x][k]+path[k][y][1:]



# 수행결과 출력
if (graph[1][gtw]==INF) or (graph[gtw][dst]==INF):
	print('도달 불가', -1)
else:
    print('최단거리:',graph[1][gtw]+graph[gtw][dst])
    print('최단경로:',path[1][gtw]+path[gtw][dst][1:])
# print(graph)
# print(path)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
