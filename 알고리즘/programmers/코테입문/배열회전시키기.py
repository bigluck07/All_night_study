'''
정수배열 numbers와 문자열 direction
numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
'''

import sys
from collections import deque

numbers = list(map(int, sys.stdin.readline().strip().split()))
direction = str(sys.stdin.readline().strip())

def solution(numbers, direction):
    numbers = list(numbers)
    if direction == 'right':
        temp = numbers.pop()
        numbers = [temp]+numbers
    else:
        temp = numbers[0]
        numbers = numbers[1:]+[temp]
        

    return numbers

print(
    solution(numbers, direction)
    
)