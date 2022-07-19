'''
문제 1 - 웨에서 아래로
- 풀이 15분, 시간제한 1초, 메모리제한 128MB, 기출 T 기업 코딩 테스트

다양한 수가 크기 상관없이 나열되어 존재하는 수열을 
큰 수 부터 작은 수 순서로 내림차수 정렬 프로그램을 만드시오.

- 예시

3
15
27
12

-> 27, 15, 12

- 입력조건
	- 첫째 줄: 수열에 속하 수의 개수 n (1<=n<=500) 
    - 둘째 줄 ~ n+1째 줄: 1dltkd 100,000 이하의 자연수
                
- 출력조건
수열을 공백으러 구분하여 출력

'''
import sys
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n = int(sys.stdin.readline().rstrip())
nums = [int(sys.stdin.readline().rstrip()) for _ in range(n)]
start_time = time.time()

# 계수정렬
def gs_sort(num_ls):
    res = []
    sort_ls = [0]*(max(num_ls)+1)
    
    for i in num_ls:
        sort_ls[i]+=1
        
    for idx, val in enumerate(sort_ls):
        if val == 0:
            continue
        else:
            res = [idx]*val+res
    return res

# 메소드
res = sorted(nums, reverse=True)

# 퀵정렬
def quick_sort(num_ls):
    if len(num_ls) <=1:
        return num_ls
    
    pivot = num_ls[0]
    tail = num_ls[1:]
    
    left_nums = [x for x in tail if x <= pivot]
    right_nums = [x for x in tail if x > pivot]
    
    return quick_sort(right_nums)+ [pivot] + quick_sort(left_nums)

print("정답(계수정렬):", *gs_sort(nums), end=' ')
print('\n')
print("정답(퀵 정렬):", *quick_sort(nums), end=' ')
print('\n')
print("정답(method):", *res, end=' ')
print('\n')

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
3
15
27
12

-> 27, 15, 12
'''