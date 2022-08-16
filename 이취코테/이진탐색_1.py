'''
문제 1 - 부품 찾기
- 풀이 30분, 시간제한 1초, 메모리제한 128MB

리스트 N에서 리스트 M의 요소 찾기
있으면 yes, 없으면 no를 출력한다

- 예시

5
8 3 7 9 2
3
5 7 9

-> no yes yes

- 입력조건
	- 첫째 줄: 정수 n (1<=n<=1,000,000) 
    - 둘째 줄: 공백을 기준으로 n개의 정수(1<=n<=1,000,000)
    - 셋째 줄: 정수 m(1<=m<=1,000,000) 
    - 넷째 줄: 공백을 기준으로 m개의 정수(1<=n<=1,000,000)
                
- 출력조건
공백을 기준으로 요소가 있으면 yes, 없으면 no를 출력

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
n_ls = list(map(int, sys.stdin.readline().rstrip().split()))
m = int(sys.stdin.readline().rstrip())
m_ls = list(map(int, sys.stdin.readline().rstrip().split()))

start_time = time.time()

# 퀵정렬
def quick_sort(nums):
    num_ls = nums.copy()
    if len(num_ls) <=1:
        return num_ls
    
    pivot = num_ls[0]
    tail = num_ls[1:]
    
    left_nums = [x for x in tail if x <= pivot]
    right_nums = [x for x in tail if x > pivot]
    
    return quick_sort(left_nums)+ [pivot] + quick_sort(right_nums)

res = quick_sort(n_ls)

def binary_search(arr, target, srt, end):
    while srt <= end:
        mid = (srt+end)//2 # 중간점
        # 찾은 경우
        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            end = mid-1
        else:
            srt = mid+1
    return None

print("정답:")


for i in m_ls:
    temp = binary_search(res, i, 0, n-1)
    if temp is None:
        print('no', end=' ')
    else:
        print('yes', end=' ')
        
print(res)

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
5
8 3 7 9 2
3
5 7 9
'''