'''
기출문제 16 - 연구소
- 풀이 40분, 시간제한 2초, 메모리제한 512MB, 기출 삼성SW 역량테스트

N*M 배경에서 바이러스의 확산을 막아봅시다. 바이러스는 상하좌우로 확산이 가능하며 
확산 범위가 최소화 되는 벽세우기를 찾아, 확산되지 않은 안전영역의 크기를 출력합니다.
0은 빈칸, 1은 벽, 2는 바이러스
새롭게 새울 수 있는 벽의 수는 3칸입니다.


- 입력조건
	- 첫째 줄: 지도의 크기 n,m(3<=n,m<=8)
    - 둘째 줄 ~ n+1째 줄:  0,1,2로 이루어진 m개의 지도 모양(단 빈칸의 개수는 3개 이상)
    
- 출력조건
첫 줄에 안전영역의 최대 크기 출력

- 예시
7 7
2 0 0 0 1 1 0
0 0 1 0 1 2 0
0 1 1 0 1 0 0
0 1 0 0 0 0 0
0 0 0 0 0 1 1
0 1 0 0 0 0 0 
0 1 0 0 0 0 0

-> 27


4 6
0 0 0 0 0 0
1 0 0 0 0 2
1 1 1 0 0 2
0 0 0 0 0 2

-> 9

8 8
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0

-> 3
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
      

n,m = map(int, sys.stdin.readline().rstrip().split()) # 지도 크기
city_map = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)] # 바이러스 확산 맵
wall_map = [[0]*m for _ in range(n)] # 안전공간 세는 맵
    
print(city_map)
start_time = time.time()

# 상우하좌 확인용
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

res = 0

def spread_virus(x,y):
    for i in range(4):
        nx = x+dx[i]
        ny = y+dy[i]
        if nx>-1 and nx<n and ny>-1 and ny < m: # 지도안에 들어오는지 확인
            if wall_map[nx][ny] == 0: # 확산할 수 있는지
                wall_map[nx][ny] = 2
                spread_virus(nx,ny)


def get_score(): # 지도의 안전영역 세기
    score = 0
    for r in wall_map:
        for node in r:
            if node == 0:
                score+=1
    return score

                
def wall_cnt(wall):
    global res
    if wall == 3: # 울타리 3개 설치했으면
        for i in range(n):
            for j in range(m):
                wall_map[i][j] = city_map[i][j]
        for i in range(n):
            for j in range(m):
                if wall_map[i][j] == 2:
                    spread_virus(i,j)
        res = max(res, get_score())
        return 

    for i in range(n):
        for j in range(m):
            if city_map[i][j] == 0:
                city_map[i][j] = 1
                wall+=1
                wall_cnt(wall)
                city_map[i][j] = 0
                wall-=1

wall_cnt(0)        
    
print("정답:", res)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
7 7
2 0 0 0 1 1 0
0 0 1 0 1 2 0
0 1 1 0 1 0 0
0 1 0 0 0 0 0
0 0 0 0 0 1 1
0 1 0 0 0 0 0 
0 1 0 0 0 0 0

-> 27


4 6
0 0 0 0 0 0
1 0 0 0 0 2
1 1 1 0 0 2
0 0 0 0 0 2

-> 9

8 8
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0

-> 3
'''