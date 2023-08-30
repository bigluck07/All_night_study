'''
침투 다국어
 
시간 제한	메모리 제한	
1 초	512 MB	

문제
섬유 물질은 2차원 M × N 격자로 표현될 수 있다. 
2차원 격자의 위쪽을 바깥쪽(outer side), 아래쪽을 안쪽(inner side)
또한 각 격자는 검은색 아니면 흰색인데, 검은색은 전류를 차단하는 물질임을 뜻하고 
흰색은 전류가 통할 수 있는 물질임을 뜻한다. 

전류는 섬유 물질의 가장 바깥쪽 흰색 격자들에 공급되고, 
이후에는 상하좌우로 인접한 흰색 격자들로 전달될 수 있다.

김 교수가 개발한 섬유 물질을 나타내는 정보가 2차원 격자 형태로 주어질 때, 
바깥쪽에서 흘려 준 전류가 안쪽까지 침투될 수 있는지 아닌지를 판단하는 프로그램을 작성하시오.
	
(a) The current percolates.	(b) The current does not percolate.
예를 들어, Figure 1(a) 에서는 바깥쪽에서 공급된 전류가 안쪽까지 침투하지만, 
Figure 1(b)에서는 그렇지 못한다.

입력
첫째 줄에는 격자의 크기를 나타내는  M (2 ≤ M ≤ 1,000) 과 N (2 ≤ N ≤ 1,000) 
M줄에 걸쳐서, N개의 0 또는 1 이 공백 없이 주어진다. 
    0은 전류가 잘 통하는 흰색, 1은 전류가 통하지 않는 검은색 격자임을 뜻한다.

출력
바깥에서 흘려준 전류가 안쪽까지 잘 전달되면 YES를 출력한다.

그렇지 않으면 NO를 출력한다.

예제 입력 1 
5 6
010101
010000
011101
100011
001011
예제 출력 1 
NO

예제 입력 2 
8 8
11000111
01100000
00011001
11001000
10001001
10111100
01010000
00001011
예제 출력 2 
YES
'''

import sys, copy
sys.setrecursionlimit(10**6)

m, n = map(int, sys.stdin.readline().strip().split())
mp = [[int(i) for i in str(sys.stdin.readline().strip())] for _ in range(m)]
hist = mp.copy()
d = [(-1, 0), (1, 0), (0, -1), (0, 1)]

def dfs(x, y):
    if (0 <= y < n) and (0 <= x < m) and hist[x][y] == 0:
        hist[x][y] = 2
        dfs(x-1, y)
        dfs(x+1, y)
        dfs(x, y-1)
        dfs(x, y+1)
            

for j in range(n):
    if hist[0][j] == 0:
        dfs(0, j)
        
print("YES" if 2 in hist[-1] else "NO")

'''
import sys, copy

m, n = map(int, sys.stdin.readline().strip().split())
mp = [[int(i) for i in str(sys.stdin.readline().strip())] for _ in range(m)]
hist = mp.copy()
d = [(-1, 0), (1, 0), (0, -1), (0, 1)]

def dfs(x1, y1):
    global hist
    hist[x1][y1] = 2
    for dx, dy in d:
        X, Y = x1+dx, y1+dy
        if (0 <= Y < n) and (0 <= X < m) and hist[X][Y] == 0:
            dfs(X, Y)
            

for j in range(n):
    if hist[0][j] == 0:
        dfs(0, j)
        
print("YES" if 2 in hist[-1] else "NO")
'''