'''
정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
'''

import sys

my_string = list(map(str, sys.stdin.readline().strip().split()))
def solution(my_string):
    answer = int(my_string[0])
    for i in my_string[1:]:
        try:
            num = int(i)
            if state == '+':
                answer+=num
            else:
                answer-=num
        except:
            state = i
            
    return answer

print(
    solution(my_string)
)