'''
브루트포스_동전 게임
 
시간 제한	메모리 제한	
1 초	  128 MB	

문제
상우는 재미있는 게임을 생각해냈다. 동전 9개를 아래 그림과 같이 3행 3열로 놓는다. H는 앞면, T는 뒷면을 의미한다.

H T T
H T T
T H H

게임의 목적은 이 동전의 모양을 모두 같은 면(H나 T)이 보이도록 하는 것이다. 
단, 하나의 동전만을 뒤집을 수는 없고, 
한 행의 모든 동전, 한 열의 모든 동전 또는 하나의 대각선 상의 모든 동전을 한 번에 뒤집어야 한다. 
그런 식으로 세 개의 동전을 뒤집는 것을 '한 번의 연산'으로 센다. 

상우는 이것을 최소 횟수의 연산으로 실행하고 싶어한다. 
오랜 시간 생각한 끝에 위의 경우는 두 번의 연산으로 가능하다는 것을 알아냈고, 
또, 이것이 최소인 것도 알아내었다.

H T T   T T T   T T T
H T T → T T T → T T T
T H H   H H H   T T T

또한, 모두 같은 면으로 만드는 것이 불가능한 모양이 있다는 것도 알아내었다. 다음이 그 예이다.

T H H
H H H
H H H

상우를 도울 수 있는 프로그램을 작성하시오.

입력
첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)
각 테스트 케이스는 세 줄로 이루어지며, 
한 줄에 세 개의 동전모양이 주어지는데, 각각의 동전 표시 사이에는 하나의 공백이 주어진다.

출력
각 테스트 케이스에 대해서, 모두 같은 면이 보이도록 만들기 위한 최소 연산 횟수를 출력하고, 
불가능한 경우에는 -1을 출력한다.

예제 입력 1 
3
H T T
H T T
T H H
T H H
H H H
H H H
H H H
H T H
H H H

예제 출력 1 
2
-1
4
'''


import sys
from collections import deque

n = int(sys.stdin.readline().strip())
coins = []
for i in range(n): # 동전 받아오기
    coin = ''
    for j in range(3):
        for k in list(map(str, sys.stdin.readline().strip().split())):
            if k == 'H':
                coin+='1'
            else:
                coin+='0'
    coins.append(coin)

def flip(coin, m, n = 0):   # 뒤집을 배열, 방법, 번호(대각선은 사용X)
    if m == 0: # n 행 뒤집기
        coin ^= int(0b111000000 >> 3 * n)        
    elif m == 1: # n 열 뒤집기
        coin ^= int(0b100100100 >> n)
    elif m == 2: # 0,0 -> 2,2 대각선 뒤집기
        coin ^= int(0b100010001)
    elif m == 3: # 0,2 -> 2,0 대각선 뒤집기
        coin ^= int(0b001010100)
    return coin


for i in range(n): # 동전마다 확인하기
    coin = int(coins[i], 2) # 코인을 2진법으로 만들어서 고유 번호 붙이기
    visited = [False] * 1000
    visited[coin] = True
    q = deque([[coin, 0]])
    find = False
    while q:
        now, cnt = q.popleft()

        if now in [0,511]:
            print(cnt)
            find = True
            break
        
        for i in range(4):
            if i < 2: # 0 행, 1 열 
                for j in range(3):
                    tmp = flip(now, i, j)
                    if not visited[tmp]:
                        q.append([tmp, cnt+1])
                        visited[tmp] = True
            else: #2 00to22 \ , 3 02to20 /
                tmp = flip(now, i)
                if not visited[tmp]:
                    q.append([tmp, cnt+1])
                    visited[tmp] = True
    if not find:
        print(-1)