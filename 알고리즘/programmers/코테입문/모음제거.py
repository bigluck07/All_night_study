'''
a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류
문자열 my_string이 매개변수로 주어질 때 
모음을 제거한 문자열을 return하도록 solution 함수를 완성
'''

import sys, re
import math

my_string = str(sys.stdin.readline().strip())

def solution(my_string):
    patten = r'[a,e,i,o,u]' # 'a|e|i|o|u'
    answer = re.sub(patten,'',my_string)
    return answer


print(
    solution(my_string)
)