'''
문자열 s가 매개변수로 주어집니다. 
s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 
solution 함수를 완성해보세요. 

한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
'''

import sys
from collections import Counter

s = str(sys.stdin.readline().strip())

def solution(s):
    answer = []
    s = Counter([x for x in s])
    for i in s:
        if s[i] == 1:
            answer.append(i)
    answer.sort()
    
    return "".join(answer)
    

print(
    solution(s)
)