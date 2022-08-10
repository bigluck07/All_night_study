'''
문제 3 - 두 배열의 원소 교체
- 풀이 20분, 시간제한 2초, 메모리제한 128MB, 국제 알고리즘 대회

N개의 자연수인 원소로 구성된 두 개의 배열 A,B는 
최대 K번 바꿔치기 연산을 수행할 수 있다.
(바꿔치기란 배열A의 원소 1개와 B의 원소 1개를 서로 교환하는 것을 의미함)
이때 A가 원소의 합이 최대가 되는 프로그램을 작성하시오

- 예시
5 3
1 2 5 4 3
5 5 6 6 5

-> 26

- 입력조건
	- 첫째 줄: N,K가 공백으로 구분되어 입력된다(1<=N<=100,000 / 0<=K<=N) 
    - 둘째 줄: 배열 A의 원소 <= 10,000,000
    - 셋째 줄: 배열 B의 원소 <= 10,000,000
                
- 출력조건
최대 K번 바꿔치기 연산을 진행한 배열 A의 합의 최대 값

'''
from re import A
import sys
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n,k = map(int, sys.stdin.readline().rstrip().split())
a = list(map(int, sys.stdin.readline().rstrip().split()))
b = list(map(int, sys.stdin.readline().rstrip().split()))
start_time = time.time()

# 계수정렬
def gs_sort(k,a,b):
    res_a = []
    res_b = []
    sort_ls1 = [0]*(max(a)+1)
    sort_ls2 = [0]*(max(b)+1)
    
    for i,o in zip(a,b):
        sort_ls1[i]+=1
        sort_ls2[o]+=1
        
    for idx, val in enumerate(sort_ls1):
        if val == 0:
            continue
        else:
            res_a = res_a+[idx]*val
            
    for idx, val in enumerate(sort_ls2):
        if val == 0:
            continue
        else:
            res_b = res_b+[idx]*val
    # print(res_a) 
    # print(res_b) 
    
    for i in range(k):
        if res_a[i] < res_b[-(i+1)]:
            res_a[i],res_b[-(i+1)] = res_b[-(i+1)],res_a[i]
        else:
            break
            
    return sum(res_a)


# 퀵정렬
def quick_sort(num_ls):
    if len(num_ls) <=1:
        return num_ls
    
    pivot = num_ls[0]
    tail = num_ls[1:]
    
    left_nums = [x for x in tail if x <= pivot]
    right_nums = [x for x in tail if x > pivot]
    
    return quick_sort(left_nums)+ [pivot] + quick_sort(right_nums)

def quck_srt(k,a,b):
    sort_a = quick_sort(a)
    sort_b = quick_sort(b)
    
    for i in range(k):
        if sort_a[i] < sort_b[-(i+1)]:
            sort_a[i],sort_b[-(i+1)] = sort_b[-(i+1)],sort_a[i]
        else:
            break
        
    return sum(sort_a)

memory_usage('#1')
print('\n')

print("정답(계수정렬):", gs_sort(k,a,b))
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
print('\n')

print("정답(퀵 정렬):", quck_srt(k,a,b))
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')


'''
5 3
1 2 5 4 3
5 5 6 6 5

-> 26
'''