'''
문제 3 - 1이 될 때까지
- 시간제한 1초, 메모리제한 128MB, 기출 2018 국가교육기관 코테

어떤 수 N이 1이 될 때까지 아래 두 과정 중 하나를 반복적으로 선택해 수행하려고 한다.
단, 두 번재 연산은 N이 K로 나누어 떨어질 때 만 선택가능하다.
    1. N-1
    2. N/K
N과 K가 주어질 수행하는 과정의 최소횟수를 구하는 프로그램을 작성하시오

- 예시

예시1
25 5

정답1
2

예시2
17 4

정답2
3

- 입력

첫째 줄에 N과 K이 공백을 기준으로 자연수로 주어진다.(2 <= N,K <= 100,000)

- 출력조건

첫째 줄에 N이 1이 될 때까지 1번 혹은 2번을 수행하는 횟수의 최소값을 출력하시오
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

while N != 1:
    if N % K != 0:
        N-=1  
    else:
        N = N//K
    result+=1
    
# while N >= K:
#     target = (N//K)*K
#     result+=(N-target)
#     N = target
#     if N < K:
#         break
#     N //= K    
#     result+=1
        
# result += (N-1)

    
print("정답:", result)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''

25 5

17 4

'''
