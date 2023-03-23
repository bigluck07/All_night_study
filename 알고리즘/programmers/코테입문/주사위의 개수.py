'''
직육면체 모양의 상자에 정육면체 모양의 주사위를 최대한 많이 채우자
가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n
상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
'''

import sys
from collections import deque

box = list(map(int, sys.stdin.readline().strip().split()))
n = int(sys.stdin.readline().strip())

def solution(box, n):
    answer = 1
    for i in box:
        answer*=(i//n)
    return answer

print(
    solution(box, n)
)