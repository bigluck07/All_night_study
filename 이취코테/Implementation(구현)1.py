'''
문제 1 - 상하좌우
- 시간제한 1초, 메모리제한 128MB, 기출 2018 국가교육기관 코테


- 예시

예시1


정답1


예시2


정답2


- 입력



- 출력조건


'''

import sys
import time
import psutil

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")
    
start_time = time.time()


result = 0

N,K = map(int, sys.stdin.readline().split())



    
print("정답:", result)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')