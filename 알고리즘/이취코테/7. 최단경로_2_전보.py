'''
문제 2 - 전보
- 풀이 60분, 시간제한 1초, 메모리제한 128MB, 기출 유명 알고리즘 대회

n개의 도시를 가진 나라에서 각 도시는 메세지를 보내려면 연결된 도로를 통해서 다른 도시로 메세지를 보내야 하며, 연결되어 있지 않다면 보낼 수 없다.
이때, c도시에서 최대한 많은 도시로 메세지를 보내려고 할때, 최대 몇 개의 도시에 메세지를 보낼 수 있으며, 
총 몇일의 시간이 걸리는는 계산하는 프로그램을 작성하시오

- 입력조건
	- 첫째 줄: 도시 수n, 도로 수 m, 메세지를 보낼 도시 c 가 공백으로 구분되어 주어짐
              (1<=n<=30,000, 1<=m<=200,000, 1<=c<=n)
	- 둘째 줄 ~ m+1째 줄: 도시x, y와 두 도시 사이의 시간가 공백으로 구분되어 주어짐
              (1<=x,y<=n, 1<=z<=1,000)
                
- 출력조건
메세지를 받는 총 도시 수와 걸리는 시간을 공백으로 구분하여 출력한다.


- 예시
3 2 1
1 2 4
1 3 2

-> 2 4
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

n,m,start = map(int, input().rstrip().split()) # 도시수, 통로수, 출발도시
    
graph = [[] for i in range(n+1)]
for _ in range(m): # 간선입력
        x,y,c = map(int, input().rstrip().split()) # 출발, 도착, 시간
        graph[x].append((y,c))
        
start_time = time.time()

distance = [INF]*(n+1) # 경로는 구하지 않아도 되서 거리만


'''
로직 - 인줄 알았으나, 한방에 여러개의 도시로 보내는 거임
다익스트라
1. 출발도시에서 모든 도시까지의 거리를 구하고 방문할 수 있는 도시를 리스트업 한다.
2. 다익스트라로 구한 경로 중 가장 많은 도시를 경유하는 도시를 방문하고 방문한 도시를 리스트업 한다.
3. 1-2번을 마지막 방문도시를 기준으로 반복하며 방문가능리스트 중 방문리스트에 없는 도시를 최대한 경유하는 경로를 찾고 걸리는 시간을 더한다.
4. 그렇게 방문이 가능한 도시에 대한 경로를 모두 구하고 걸리는 시간을 더한 후 결과를 출력한다.

로직2 다익스트라는 맞음
1. 다익스트라로 출발도시에서의 모든 경로에 대한 최단 거리를 구한다.
2. 갈 수 있는 모든 도시를 세고, 가장 멀리있는 도시까지의 거리를 구한다.


이슈
문제에 대한 설명이 부족한 듯
1. x,y,z 가 단방향인지 말 안함.
2. 한번에 여러개의 메세지를 보낼 수 있다고 말 안함.
'''

def dijx_algo(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0
    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in graph[now]:
            cost = dist+i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))
                
    # print(distance)
    return distance

answer = [-1, 0]
dijx_algo(start)
for i in distance:
    if i != INF:
        answer[0]+=1
        answer[1] = max(answer[1], i)
        
print(*answer)
end_time1 = time.time()
print(("time :", end_time1-start_time))
memory_usage('#1')

'''
[1]      [1, 2]   [1, 3]   [1, 4][1, 3, 5]
[2, 1]   [2]      [2, 1, 3][2, 4][2, 4, 5]
[3, 1]   [3, 1, 2][3]      [3, 4][3, 5]
[4, 1]   [4, 2]   [4, 3]   [4]   [4, 5]
[5, 3, 1][5, 4, 2][5, 3]   [5, 4][5]
'''