'''
문제 3 - 타임머신
- 풀이 60분, 시간제한 1초, 메모리제한 256MB, 기출 백준 골드 4

N개의 도시가 있다. 그리고 한 도시에서 출발하여 다른 도시에 도착하는 버스가 M개 있다. 
각 버스는 A, B, C로 나타낼 수 있는데, A는 시작도시, B는 도착도시, C는 버스를 타고 이동하는데 걸리는 시간이다. 
시간 C가 양수가 아닌 경우가 있다. C = 0인 경우는 순간 이동을 하는 경우, C < 0인 경우는 타임머신으로 시간을 되돌아가는 경우이다.

1번 도시에서 출발해서 나머지 도시로 가는 가장 빠른 시간을 구하는 프로그램을 작성하시오.

- 입력조건
	- 첫째 줄: 도시의 개수 N (1 ≤ N ≤ 500), 버스 노선의 개수 M (1 ≤ M ≤ 6,000)

	- 둘째 줄 ~ m+1째 줄: 버스 노선의 정보 A, B, C (1 ≤ A, B ≤ N, -10,000 ≤ C ≤ 10,000)

                
- 출력조건
만약 1번 도시에서 출발해 어떤 도시로 가는 과정에서 시간을 무한히 오래 전으로 되돌릴 수 있다면 첫째 줄에 -1을 출력한다. 
그렇지 않다면 N-1개 줄에 걸쳐 각 줄에 1번 도시에서 출발해 2번 도시, 3번 도시, ..., N번 도시로 가는 
가장 빠른 시간을 순서대로 출력한다. 
만약 해당 도시로 가는 경로가 없다면 대신 -1을 출력한다.


- 예시
예제 1
3 4
1 2 4
1 3 3
2 3 -1
3 1 -2
->  3
    4

예제 2
3 4
1 2 4
1 3 3
2 3 -4
3 1 -2
->   -1

예제 3
3 2
1 2 4
1 2 3
->  3
    -1
'''
import sys, copy, heapq, time, psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")

'''
로직

예시를 확인하니, 시간이  -1인 경우가 존재함, 따라서 경로에따라 최단경로가 무한루프를 돌며 최단거리가 계속 짧아지는지 확인할 필요가 존재함
따라서 음의 간선을 사용할 수 있는 벨만포드를 활용하여 무한루프가 존재하는지 확인한다.

다익스 트라와 로직 구현은 비슷하지만, 음의 간선을 사용하고 무한루프를 확인할 수 있다는 특징이 있음.
그리고 다익스트라처럼 현재 노드에서 다음 노드로의 방향을 고를 때 최단거리 노드를 찾아야 하지만, 
벨먼 포드는 어차피 모든 노드를 확인해야 해서 해당 과정이 필요 없음

구현
1. 주어진 간선정보에 따라서 출발 노드에서 각 노드를 방문하는 최단경로를 찾는다.
2. 이후 노드-1 번만큼 반복하며 최단거리가 줄어드는 곳을 찾는다. 있다면 그곳이 무한루프

이슈 출력이 노드의 오름차순으로 되야함

'''
 
input = sys.stdin.readline
start_time = time.time()
INF = int(1e9)

n,m = map(int, input().rstrip().split()) # 도시 수, 노선 수

graph = []
for _ in range(m): # 간선입력
        x,y,c = map(int, input().rstrip().split()) # 출발, 도착, 시간
        graph.append((x,y,c))
        
start_time = time.time()


def blmn_ford(citys, ways, map, start):
    distance = [INF]*(n+1)
    distance[start] = 0
    
    for i in range(citys): # 노드 수 만큼 반복
        for way in map: # 모든 간선 확인
            cur_node = way[0] # 현재노드
            next_node = way[1] # 인접노드
            edge_cost = way[2] # 거리
            if distance[cur_node] != INF and distance[next_node] > distance[cur_node] + edge_cost:
                distance[next_node] = distance[cur_node] + edge_cost
                # v번째 라운드에서도 값이 갱신된다면 음수 순환이 존재
                if i == citys-1:
                    return True, distance

    return False, distance

res, dis = blmn_ford(n,m,graph,1)
if res: # 무한루프 존재
    print(-1)
else:
    for i in dis[2:]:
        if i != INF:
            print(i)
        else:
            print(-1)

end_time1 = time.time()
print(("time :", end_time1-start_time))
memory_usage('#1')

'''

'''