'''
문자열 my_string이 매개변수로 주어집니다. 
my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. 
my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.


제한사항
1 ≤ my_string의 길이 ≤ 1,000
1 ≤ my_string 안의 자연수 ≤ 1000
연속된 수는 하나의 숫자로 간주합니다.
000123과 같이 0이 선행하는 경우는 없습니다.
문자열에 자연수가 없는 경우 0을 return 해주세요.
'''

import sys


my_string = "zzz111"


def solution(my_string):
    answer = 0
    ls = ['1', '2','3','4','5','6','7','8','9','0']
    num = '0'
    for idx, val in enumerate(my_string):
        if val in ls:
            num+=val
        else:
            answer+=int(num)
            num = '0'
        if num !='0' and idx ==len(my_string)-1:
            answer+=int(num)
    return answer


print(
    solution(my_string)
)



def solution(my_string):
    import re
    answer = sum(list(map(int, re.findall(r'\d+', my_string))))
    # sum([int(i) for i in re.sub('[^1-9]',"*",my_string).split("*") if i]) 
    return answer

print(
    solution(my_string)
)