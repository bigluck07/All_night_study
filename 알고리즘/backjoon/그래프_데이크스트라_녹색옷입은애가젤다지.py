'''
녹색 옷 입은 애가 젤다지? 다국어
 
시간 제한	메모리 제한
1 초	    256 MB
	
문제
젤다의 전설 게임에서 화폐의 단위는 루피(rupee)다. 그런데 간혹 '도둑루피'라 불리는 검정색 루피도 존재하는데, 
이걸 획득하면 오히려 소지한 루피가 감소하게 된다!

젤다의 전설 시리즈의 주인공, 링크는 지금 도둑루피만 가득한 N x N 크기의 동굴의 제일 왼쪽 위에 있다. [0][0]번 칸
링크는 이 동굴의 반대편 출구, 제일 오른쪽 아래 칸인 [N-1][N-1]까지 이동해야 한다. 
동굴의 각 칸마다 도둑루피가 있는데, 이 칸을 지나면 해당 도둑루피의 크기만큼 소지금을 잃게 된다. 
링크는 잃는 금액을 최소로 하여 동굴 건너편까지 이동해야 하며, 한 번에 상하좌우 인접한 곳으로 1칸씩 이동할 수 있다.

링크가 잃을 수밖에 없는 최소 금액은 얼마일까?

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스의 
첫째 줄에는 동굴의 크기를 나타내는 정수 N이 주어진다. (2 ≤ N ≤ 125) N = 0인 입력이 주어지면 전체 입력이 종료된다.
N개의 줄에 걸쳐 동굴의 각 칸에 있는 도둑루피의 크기가 공백으로 구분되어 차례대로 주어진다. 
    도둑루피의 크기가 k면 이 칸을 지나면 k루피를 잃는다는 뜻이다. 여기서 주어지는 모든 정수는 0 이상 9 이하인 한 자리 수다.

출력
각 테스트 케이스마다 한 줄에 걸쳐 정답을 형식에 맞춰서 출력한다. 형식은 예제 출력을 참고하시오.

예제 입력 1 
3
5 5 4
3 9 1
3 2 7
5
3 7 2 0 1
2 8 0 9 1
1 2 1 8 1
9 8 9 2 0
3 6 5 1 5
7
9 0 5 1 1 5 3
4 1 2 1 6 5 3
0 7 6 1 6 8 5
1 1 7 8 3 2 3
9 4 0 7 6 4 1
5 8 3 2 4 8 3
7 4 8 4 8 3 4
0
예제 출력 1 
Problem 1: 20
Problem 2: 19
Problem 3: 36
'''


import sys, heapq

# def check_hist(n):
#     for x in range(n):
#         for y in range(n):
#             if x == 0:
#                 hist[x][y] = hist[x][y-1]+grp[x][y]
#                 continue
#             elif y == 0:
#                 hist[x][y] = hist[x-1][y]+grp[x][y]
#                 continue
#             else:
#                 temp1 = min(hist[x-1][y]+grp[x][y], hist[x][y-1]+grp[x][y])
#                 hist[x][y] = temp1

#     res = hist[n-1][n-1]
#     return res



cnt = 0
while True:
    cnt+=1
    n = int(sys.stdin.readline().strip())
    if n == 0:
        break
    
    grp = [list(map(int, sys.stdin.readline().strip().split())) for _ in range(n)]
    hist = [[False]*n for _ in range(n)]
    hq = [(grp[0][0], 0,0)]
    while hq:
        now_point,x,y = heapq.heappop(hq)
        if hist[x][y]:
            continue
        hist[x][y] = True
        
        if x==n-1 and y==n-1:
            print(f"Problem {cnt}: {now_point}")
            break
        for a,b in [(0,1),(1,0),(0,-1),(-1,0)]:
            dx=x+a
            dy=y+b
            if n>dx>=0 and n>dy>=0 and not hist[dx][dy]:
                heapq.heappush(hq, (now_point+grp[dx][dy], dx,dy)) 