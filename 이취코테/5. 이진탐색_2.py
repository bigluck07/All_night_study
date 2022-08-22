'''
문제 1 - 떡볶이 떡 만들기
- 풀이 40분, 시간제한 2초, 메모리제한 128MB

떡집에서 알바하는 동빈이가 절단기의 높이 h를 조절할 수 있는데, 
절단기는 줄지어진 떡을 한번에 절단하며 떡의 길이는 상이하다.

손님이 요청한 길이 m을 받아 특정 높이 h로 절단하고,
잘려진 떡 길이의 합이 최소 m을 갖는 최고 h값을 구하시오.

- 예시

4 6
19 15 10 17

-> 15


- 입력조건
	- 첫째 줄: 떡의 개수 n, 요청한 떡의 길이 m (1<=n<=1,000,000 1<=m<=2,000,000,000) 
    - 둘째 줄: n개의 정수(n의 합은 항상 m보다 크다)
                
- 출력조건
잘린 떡의 합이 적어도 m보다 같거나 큰 h의 최대값

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
      
n, m = map(int, sys.stdin.readline().rstrip().split())
arr = np.array(list(map(int, sys.stdin.readline().rstrip().split())))


start_time = time.time()

def binary_search(arr, target, mid, end):
    while mid:
        
        def cuting(arr, mid): # 떡 자르기
            temp = []
            for i in arr:
                if i > mid:
                    temp.append(i-mid)
            return sum(temp)
        
        res = cuting(arr, mid)
        if res == target: # 딱맞으면
            return mid
        elif res > target: # 자른떡이 길면
            if cuting(arr, mid+1) < target: # 자른 떡이 긴데, 높이를 올리면 짧아지는 경우
                return mid
            mid+=1
        else:
            mid-=1
    return None

print("정답:", binary_search(arr, m, 0, max(arr)))

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''

4 6
19 15 10 17

-> 15
'''