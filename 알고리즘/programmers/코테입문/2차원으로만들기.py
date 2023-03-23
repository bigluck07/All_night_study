'''
1차원 배열 num_list이 주어지고 배열에 넣을 요소의 개수가 n으로 주어질때 
num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 반환하는 solution 함수를 완성해주세요.

'''

import sys

num_list = list(map(int, sys.stdin.readline().strip().split()))
n = int(sys.stdin.readline().strip())

def solution(num_list, n):
    answer = []
    cnt = 0
    for i in range(n, len(num_list)+1, n):
        answer.append(num_list[i-n:i])
    return answer

print(
    solution(num_list, n)
)