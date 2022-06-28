'''
문제 2 - 게임 개발
- 풀이 40분, 시간제한 1초, 메모리제한 128MB

N*M 좌표평면에서 캐릭터가 메뉴얼대로 움직여서 이동한 칸의 수 출력하기
각 칸은 육지와 바다로 이뤄지며 (A,B)로 표현가능하다.
(A는 북쪽에서 의 거리, B는 서쪽에서의 거리를 의미)
캐릭터는 상하좌우로 움직일 수 있으며, 바다인 칸은 갈 수 없다
    - 캐릭터 움직임 메뉴얼
        1. 현 위치에서 현재 방향을 기준으로 왼쪽방향(반시계 90도)부터 차례대로 갈 곳을 정한다.
        2. 캐릭의 바로 왼쪽 방향에 가보지 않은 칸이 있다면 왼쪽으로 회전 후 한 칸 전진, 가본 칸이면 회전만함
        3. 사방이 모두 가본 칸이거나 바다면 바라본 방향을 유지한채 한 칸 뒤로 가고 1단계로 돌아간다.(단, 뒷칸이 바다라면 그 자리에서 정지)

- 예시
    4 4
    1 1 0
    1 1 1 1 
    1 0 0 1
    1 1 0 1
    1 1 1 1 
    -> 3

- 입력조건
	- 첫째 줄: N, M이 공백을 기준으로 입력 (3<=N,M<=50)
    - 둘째 줄: 캐맅러 좌표(A,B)와 바라보는 방향d가 공백을 기준으로 입력
                d의 경우 [0:북,1:동,2:남,3:서]의 값을 가질 수 있음
    - 셋째 줄: 맵의 상태(육지, 바다)의 정보가 N개의 줄에 북->남의 순서로 문자열로 들어오되, 서->동의 순서로 들어온다
                단, 맵의 외관은 항상 바다다
                
- 출력조건
첫 줄에 정답 출력

'''
4
import sys
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n,m = map(int, sys.stdin.readline().rstrip().split())
arrived = [[0]* m for _ in range(n)]
x,y,z = map(int, sys.stdin.readline().rstrip().split())
maps = np.array([sys.stdin.readline().rstrip().split() for _ in range(n)]).T
arrived[x][y] = 1

start_time = time.time()
wnd = {0:(-1,0), 3:(0,1), 2:(1,0), 1:(0,-1)}


cnt = 1
way = 0


def turn_left():
    global z
    z-=1
    if z == -1:
        z=3
    
while way!=4:
    turn_left()
    a = x+wnd[z][0]
    b = x+wnd[z][1]
    loc = maps[a][b]
    if loc == 0 and arrived[a][b] != 1: # 캐릭터가 보고있는 곳이 육지면서 안가본 곳이면
        cnt+=1   # 1칸 세기
        x = a.copy()
        y = b.copy()
        arrived[x][y] = 1
        way=0
        continue
    else:
        way+=1

# 4방향 모두 막힌 경우        
a = x-wnd[z][0]
b = x-wnd[z][1]
loc = maps[a][b]

# 뒤로 갈 수 있는지 확인
if loc == 0:
    x = a.copy()
    y = b.copy()
else:
    pass
            

print("정답:", cnt)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
4 4
1 1 0
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1

c2 -> 6

'''