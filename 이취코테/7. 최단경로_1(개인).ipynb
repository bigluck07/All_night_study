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
start_time = time.time()
INF = int(1e9)

def fw_algo():
    
    n,m = map(int, input().rstrip().split())
    graph = [[[INF, []] for _ in range(n+1)]for _ in range(n+1)]# 거리와 경로
    
    for i in range(1,m+1): # 간선입력
        a,b = map(int, input().rstrip().split())
        graph[a][b][0] = 1
        graph[a][b][1] = [a,b]
        graph[b][a][0] = 1
        graph[b][a][1] = [b,a]
    
    destination, gateway = map(int, input().rstrip().split())
    
    for i in range(1,n+1): # 자기자리
        graph[i][i][0] = 0
        graph[i][i][1] = [i]

    for k in range(1, n+1):
        for x in range(1, n+1):
            for y in range(1, n+1):
                temp = graph[x][y][0]
                graph[x][y][0] = min(graph[x][y][0], graph[x][k][0]+graph[k][y][0])
                if temp != graph[x][y][0]: # 갱신확인
                    graph[x][y][1] = graph[x][k][1]+graph[k][y][1][1:]

    if (graph[1][gateway][0]==INF) or (graph[gateway][destination][0]==INF):
        print('도착지 접근 불가', -1)
    else:
        print('최단거리:', graph[1][gateway][0]+graph[gateway][destination][0])
        print('최단경로:', graph[1][gateway][1]+graph[gateway][destination][1][1:])
        
    return graph

# fw_algo()  
 
# end_time1 = time.time()
# print(("time :", end_time1-start_time))
# memory_usage('#1')

def dix_algo(n,m,graph, start = 1):
    '''
    경로 넣는 것 수정해야 함
    '''
    distance = [[INF, []] for _ in range(n+1)]
    distance[start][1] = [start]
    q = []
    heapq.heappush(q, (0, start))
    distance[start][0] = 0
    while q:
        dist, now = heapq.heappop(q)
        # if not now in distance[now][1]:
        #     distance[now][1] = [now]
        if distance[now][0] < dist:
            continue
        for i in graph[now]:
            cost = dist+1
            if cost < distance[i][0]:
                distance[i][0] = cost
                heapq.heappush(q, (cost, i))
                distance[i][1] = distance[now][1]+[i]
    return distance


n,m = map(int, input().rstrip().split())
graph = [[] for i in range(n+1)]
for _ in range(m): # 간선입력
        a,b = map(int, input().rstrip().split())
        graph[a].append(b)
        graph[b].append(a)
destination, gateway = map(int, input().rstrip().split())
ToGtw = dix_algo(n,m,graph, 1)
ToDtn = dix_algo(n,m,graph, gateway)

print(ToGtw[gateway])
print(ToDtn[destination])
end_time2 = time.time()
# print(("time :", end_time2-end_time1))
memory_usage('#1')


'''
[1]      [1, 2]   [1, 3]   [1, 4][1, 3, 5]
[2, 1]   [2]      [2, 1, 3][2, 4][2, 4, 5]
[3, 1]   [3, 1, 2][3]      [3, 4][3, 5]
[4, 1]   [4, 2]   [4, 3]   [4]   [4, 5]
[5, 3, 1][5, 4, 2][5, 3]   [5, 4][5]
'''