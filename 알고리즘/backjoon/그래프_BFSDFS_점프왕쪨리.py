'''
양치기 꿍
 
시간 제한	메모리 제한	
1 초	128 MB	

같은 울타리 영역 안의 양들의 숫자가 늑대의 숫자보다 더 많을 경우 늑대가 전부 잡아먹힌다. 
물론 그 외의 경우는 양이 전부 잡아먹히겠지만 말이다.

빈 공간 '.'(점), 울타리 '#', 늑대 'v', 양 'k', 
몇 마리의 양과 늑대가 살아남을지 계산

단, 울타리로 막히지 않은 영역에는 양과 늑대가 없으며 
양과 늑대는 대각선으로 이동할 수 없다.

입력
첫 번째 줄에는 영역의 세로, 가로 길이인 정수 R, C (3 ≤ R, C ≤ 250)
다음 각 R줄에는 C개의 문자가 주어지며 이들은 위에서 설명한 기호들이다.

출력
살아남게 되는 양과 늑대의 수를 각각 순서대로 출력한다.

예제 입력 1 
6 6
...#..
.##v#.
#v.#.#
#.k#.#
.###.#
...###
예제 출력 1 
0 2

예제 입력 2 
8 8
.######.
#..k...#
#.####.#
#.#v.#.#
#.#.k#k#
#k.##..#
#.v..v.#
.######.
예제 출력 2 
3 1

예제 입력 3 
9 12
.###.#####..
#.kk#...#v#.
#..k#.#.#.#.
#..##k#...#.
#.#v#k###.#.
#..#v#....#.
#...v#v####.
.####.#vv.k#
.......####.
예제 출력 3 
3 5
'''


import sys
from collections import deque

r,c = map(int, sys.stdin.readline().strip().split())
mp = [list(map(str, sys.stdin.readline().strip())) for _ in range(r)]
visited = [[0] * c for _ in range(r)]

# 상, 하, 좌 우
d = [(-1,0),(1,0),(0,-1),(0,1)]
q = deque()

def solve(x,y):
    global wf, sp
    visited[x][y] = 1
    
    q.append([x,y])
    
    while q:
        x,y = q.popleft()
        
        # wolf, sheep
        if mp[x][y] =='v':
            wf+=1
        elif mp[x][y] =='k':
            sp+=1
        
        # 상하좌우 체크
        for dx,dy in d:
            nx = x+dx
            ny = y+dy
            
            # 범위 안, 울타리 안, 방문 전
            if 0<=nx<r and 0<=ny<c and mp[nx][ny]!='#' and visited[nx][ny]==0:
                q.append([nx,ny])
                visited[nx][ny]=1
wolf = 0
sheep = 0

for i in range(r):
    for j in range(c):
        if mp[i][j] != '#' and visited[i][j]==0:
            wf = 0
            sp = 0
            solve(i,j)
            if wf >= sp:
                sp = 0
            else:
                wf = 0
                
            wolf+=wf
            sheep+=sp

print(sheep, wolf)
        