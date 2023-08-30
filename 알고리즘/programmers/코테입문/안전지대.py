'''
다음 그림과 같이 지뢰가 있는 지역과 
지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.

00000
00000
00100
00000
00000

제한사항
board는 n * n 배열입니다.
1 ≤ n ≤ 100
지뢰는 1로 표시되어 있습니다.
board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
'''

import sys, copy


# board = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]
board = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]
# board = [[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]


def solution(board):
    answer = 0
    ch = [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 0), (0, 1), (1, -1), (1, 0), (1, 1)]
    xy = len(board)
    visited = [[0]*xy for _ in range(xy)] # visited = board.copy()
    for y,ls in enumerate(board):
        for x,val in enumerate(ls):
            if val == 1:
                for dx,dy in ch:
                    if 0<=x+dx<xy and 0<=y+dy<xy: 
                            visited[y+dy][x+dx] = 1
    
    for i in visited:
        print(i)
        for j in i:
            if j == 0:
                answer+=1
    return answer


print(
    solution(board)
)

# row = [-1, 0, 1]
# col = [-1, 0, 1]
# danger_zone = [[0] * len(board) for _ in range(len(board))] 
# danger_zone_index = []
# for r in row:
#     for c in col:
#         danger_zone_index.append((r, c))

# print(danger_zone_index)