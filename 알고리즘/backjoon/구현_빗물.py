'''
빗물
 
시간 제한	메모리 제한
1 초	256 MB	

문제
2차원 세계에 블록이 쌓여있다. 비가 오면 블록 사이에 빗물이 고인다.

비는 충분히 많이 온다. 고이는 빗물의 총량은 얼마일까?

입력
첫 번째 줄에는 2차원 세계의 세로 H과 가로 W가 주어진다. (1 ≤ H, W ≤ 500)
두 번째 줄에는 블록이 쌓인 높이 0이상 H이하의 정수가 
    2차원 세계의 맨 왼쪽 위치부터 차례대로 W개 주어진다.

따라서 블록 내부의 빈 공간이 생길 수 없다. 
또 2차원 세계의 바닥은 항상 막혀있다고 가정하여도 좋다.

출력
2차원 세계에서는 한 칸의 용량은 1이다. 고이는 빗물의 총량을 출력하여라.

빗물이 전혀 고이지 않을 경우 0을 출력하여라.

예제 입력 1 
4 4
3 0 1 4
예제 출력 1 
5
예제 입력 2 
4 8
3 1 2 3 4 1 1 2
예제 출력 2 
5
예제 입력 3 
3 5
0 0 0 2 0
예제 출력 3 
0

힌트
힌트 1:
0002
2112
2112
2122


힌트 2:
00002000
21122000
21222112
22222222


힌트 3:
00000
00020
00020

'''


import sys, math, copy

h,w  = map(int, sys.stdin.readline().strip().split())
mp = list(map(int, sys.stdin.readline().strip().split()))
block = [[0]*w for _ in range(h)]
for y in range(w):
    for x in range(mp[y]):
        block[x][y] = 1

answer = 0
for i in range(h):
    strt = False
    s = 0
    for j in range(w):
        if block[i][j] == 1:
            if strt == True and s>0:
                answer+=s
                s=0
            strt = True
        elif strt == True:
            s+=1
            
print(answer)