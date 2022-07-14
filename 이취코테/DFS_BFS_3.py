'''
기출문제 15 - 특정 거리의 도시 찾기
- 풀이 30분, 시간제한 2초, 메모리제한 256MB

1~n번까지의 도시와 m개의 단반향 도로가 존재하며, 모든 도로의 거리는 1이다.
이때, 특정도시 X에서 출발해 최단거리가 K인 모든 도시의 번호를 출력하는 프로그램을 작성하시오.
또한 X에서 X로 가는 최단거리는 0라고 가정한다.
단 k거리의 도시가 없는 경우 -1을 출력한다


- 입력조건
	- 첫째 줄: 도시 개수n, 도로 개수m, 거리정보k, 출발도시번호 x가 공백을 기준으로 주어진다.
              (2<=n<=300000, 1<=m<=1000000, 1<=k<=3000000, 1<=x<=n) 
    - 둘째 줄 ~ m+1째 줄: a, b가 공백을 기준으로 주어지며 a->b의 단방향 도로가 이어져 있음을 의미한다. 단 a,b는 서로 다른 자연수이다.
                        (1<=a,b<=n)
    
- 출력조건
첫 줄에 정답 출력

- 예시
    4 4 2 1
    1 2 
    1 3
    2 3
    2 4
     
    -> 4


    4 3 2 1
    1 2
    1 3
    1 4
    
    -> -1
    
    
    4 4 1 1
    1 2 
    1 3
    2 3
    2 4
    
    -> 2, 3
'''
import sys
import time
import psutil
import numpy as np
from collections import deque

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      

citys,ways,roots,start_point = map(int, sys.stdin.readline().rstrip().split()) # 도시개수, 도로수, 최단거리, 시작도시
city_map = [[] for _ in range(citys+1)] # 도시 개수만큼의 그래프 생성 단, 0도시는 없지만 슬라이싱의 편의를 위해 0도 생성

for i in range(ways): # 도로 정보 수집
    a,b = map(int, sys.stdin.readline().rstrip().split()) # a->b
    city_map[a].append(b)
    
print(city_map)

start_time = time.time()

# 도시간 최단거리 확인용 변수
distnt = [-1] * (citys+1)
distnt[start_point] = 0 # 시작점->시작점 = 0


def bfs(s):
    q = deque([s])
    
    while q:
        now_point = q.popleft()
        for next_point in city_map[now_point]: # 현재 도시에서 갈 수 있는 도시 확인
            if distnt[next_point] == -1: # 방문 전 도시인 경우
                distnt[next_point] = distnt[now_point]+1 # 현재도시의 거리+1을 입력
                q.append(next_point) # 다음도시를 큐에 저장
                
    # 최단거리가 roots인 도시를 오름차순 정렬
    ans = False
    citys_in_roots = []
    for i in range(1, citys+1): # 0인 도시는 없으니까!
        if distnt[i] == roots: # 출발점-다른도시 최단거리가 roots와 같다면
            citys_in_roots.append(i)
            ans = True
    if ans == False: # roots인 도시가 없다면
        return -1
    
    return citys_in_roots

ans = bfs(start_point)


print("정답:")
for i in ans: print(i)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
4 4 2 1
1 2 
1 3
2 3
2 4
     
    -> 4


4 3 2 1
1 2
1 3
1 4
    
    -> -1
    
    
4 4 1 1
1 2 
1 3
2 3
2 4
    
    -> 2, 3
'''