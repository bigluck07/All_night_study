'''
x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 
좌표 dot이 사분면 중 어디에 속하는지  1, 2, 3, 4 중 하나를 return 하도록 
solution 함수를 완성해주세요.

제한사항
- dot의 길이 = 2
- dot[0]은 x좌표를, dot[1]은 y좌표를 나타냅니다
- -500 ≤ dot의 원소 ≤ 500
- dot의 원소는 0이 아닙니다.
'''
import sys

nums = list(map(int, sys.stdin.readline().strip().split()))


def solution(dot):
    answer = 0
    x,y = True,True
    
    if dot[0] > 0:
        pass
    else:
        x = False
    if dot[1] > 0:
        pass
    else:
        y = False
    
    if x and y:
        answer = 1
    elif (not x) and y:
        answer = 2
    elif (not x) and (not y):
        answer = 3
    else:
        answer = 4
        
    return answer

print(solution(nums))