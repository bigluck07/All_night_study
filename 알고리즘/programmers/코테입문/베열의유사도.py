'''
정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
'''

import sys

s1 = list(map(str, sys.stdin.readline().strip().split()))
s2 = list(map(str, sys.stdin.readline().strip().split()))

def solution(s1, s2):
    answer = 0
    max_len = max(len(s1), len(s2))
    if len(s1) == max_len:
        dic = {x:0 for x in s1}
        ls = s2
    else:
        dic = {x:0 for x in s2}
        ls = s1
    
    for i in ls:
        try:
            dic[i]
            answer+=1
        except:
            continue
    
    return answer

print(
    solution(s1, s2)
)