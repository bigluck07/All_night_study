'''
공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, 
k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 
solution 함수를 완성해보세요.

- 2 < numbers의 길이 < 100
- 0 < k < 1,000
- numbers의 첫 번째와 마지막 번호는 실제로 바로 옆에 있습니다.
- numbers는 1부터 시작하며 번호는 순서대로 올라갑니다.
'''

import sys
from collections import deque

numbers = list(map(int, sys.stdin.readline().strip().split()))
k = int(sys.stdin.readline().strip())

def solution(numbers, k):
    answer = 0
    point = 0
    cnt = 0
    while cnt != k:
        if point >= len(numbers)-1:
            point -= len(numbers)
        
        answer = numbers[point]
        cnt+=1
        point+=2
    return answer

print(
    solution(numbers, k)
)