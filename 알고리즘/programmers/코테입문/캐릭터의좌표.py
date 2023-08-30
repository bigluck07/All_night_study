'''
게임에는 up, down, left, right 방향키가 있으며 
각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다. 

예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], 
down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다. 

입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다. 
캐릭터는 항상 [0,0]에서 시작할 때 
키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 
solution 함수를 완성해주세요.

[0, 0]은 board의 정 중앙에 위치합니다. 
예를 들어 board의 가로 크기가 9라면 왼쪽 [-4, 0]까지 오른쪽 [4, 0]까지 이동할 수 있습니다.

제한사항
board은 [가로 크기, 세로 크기] 형태로 주어집니다.
board의 가로 크기와 세로 크기는 홀수입니다.
board의 크기를 벗어난 방향키 입력은 무시합니다.
0 ≤ keyinput의 길이 ≤ 50
1 ≤ board[0] ≤ 99
1 ≤ board[1] ≤ 99
keyinput은 항상 up, down, left, right만 주어집니다.

'''

import sys, re
import math

keyinput = ["down", "down", "down", "down", "down"]
board = [7, 9]

def solution(keyinput, board):
    answer = [0,0]
    L,R = board[0]//2, board[0]//2
    U,D = board[1]//2, board[1]//2
    print(L,R,U,D)
    
    for i in keyinput:
        if i == 'left' and L!=0:
            R+=1
            L-=1
            answer[0]-=1
        elif i == 'right' and R!=0:
            R-=1
            L+=1
            answer[0]+=1
        elif i == 'up' and U!=0:
            U-=1
            D+=1
            answer[1]+=1
        elif i == 'down' and D!=0:
            U+=1
            D-=1
            answer[1]-=1
    return answer


print(
    solution(keyinput, board)
)