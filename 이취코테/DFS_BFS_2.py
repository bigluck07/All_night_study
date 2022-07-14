'''
문제 2 - 미로탈출
- 풀이 30분, 시간제한 1초, 메모리제한 128MB

n*m 크기의 직사각형 미로에 갇혀있다. 유저는 (1,1)에 위치하며 출구는 (n,m)에 위치.
미로는 0,1로 이뤄지며 이동할 수 있는 길은 1로 표시된다.
이때 유저가 탈출할 수 있는 최단루트의 칸수를 구하시오
단, 칸을 셀 때는 시작 칸과 마지막 칸을 모두 포함해 계산한다.


- 입력조건
	- 첫째 줄: 정수 n,m이 공백을 기준으로 주어짐(4<= n,m <=200)
    - 둘째 줄 ~ n+1째 줄: m개의 정수(1 or 0)가 공백없이 입력  
                        (단, 시작칸과 탈출칸은 항상 1이다.)
- 출력조건
첫 줄에 정답 출력

- 예시
    5 6
    101010
    111111
    000001
    111111
    111111
     
    -> 10개

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
      

n,m = map(int, sys.stdin.readline().rstrip().split())
maze_map = [list(map(int, sys.stdin.readline().rstrip())) for i in range(n)]
print(maze_map)

start_time = time.time()
dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs(x,y):
    queue = deque()
    queue.append((x,y))
    
    while queue:
        x,y = queue.popleft()
        for i in range(4):
            tx = x+dx[i]
            ty = y+dy[i]
            if tx < 0 or ty < 0 or tx>=n or ty >= m: # 미로크기 확인
                continue
            if maze_map[tx][ty] == 0:
                continue
            if maze_map[tx][ty] == 1:
                maze_map[tx][ty] = maze_map[x][y]+1
                queue.append((tx,ty))
    return maze_map[n-1][m-1]

cnt = bfs(0,0)



print("정답:", cnt)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
5 6
101010
111111
000001
111111
111111
'''