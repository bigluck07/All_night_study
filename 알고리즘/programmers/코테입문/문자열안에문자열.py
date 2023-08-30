'''
문자열 str1, str2가 매개변수로 주어집니다. 
str1 안에 str2가 있다면 1을 없다면 2를 return하도록 
solution 함수를 완성해주세요.
'''

import sys

str1 = "ab6CDE443fgh22iJKlmn1o"
str2 = "6CD"


def solution(str1, str2):
    answer = 1
    if str2 in str1:
        return answer
    answer+=1
    return answer

print(
    solution(str1, str2)
)