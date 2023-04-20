'''
문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 
solution 함수를 완성해보세요.
'''

import sys

my_string = str(sys.stdin.readline().strip())
num1 = int(sys.stdin.readline().strip())
num2 = int(sys.stdin.readline().strip())

def solution(my_string, num1, num2):
    s_num = min(num1, num2)
    b_num = max(num1, num2)
    answer = my_string[:s_num]+my_string[b_num]+my_string[s_num+1:b_num]+my_string[s_num]+my_string[b_num+1:]    
    return answer
    
print(
    solution(my_string, num1, num2)
)