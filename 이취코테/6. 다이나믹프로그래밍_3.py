'''
문제 3 - 바닥 공사
- 풀이 20분, 시간제한 1초, 메모리제한 128MB

가로n 세로2인 직사각형을 1*2, 2*1, 2*2의 덮개를 이용해 채우려고 한다,
바닥을 채우는 모든 경우의 수를 구하시오

- 예시
3

-> 5


- 입력조건
	- 첫째 줄: 가로 정수 N(1 <= X <= 1,000)
                
- 출력조건
직사각형을 채우는 모든 경우의 수를 796,796로 나눈 나머지 값을 출력한다

'''

import sys, copy
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n = int(sys.stdin.readline().rstrip())

start_time = time.time()

num_rule = {1:1,2:3}
# num_rule = [0,1,3] + [0]*(n+1)

def dynamic_prog(num):
    try:
        if num_rule[num] >= 1:
            return num_rule[num]
        
        for i in range(3, num+1):
            num_rule[i] = (num_rule[i-1] + 2*num_rule[i-2])%796796
        return num_rule[num]
    
    except:

        for i in range(3, num+1):
            num_rule[i] = (num_rule[i-1] + 2*num_rule[i-2])%796796
            
        return num_rule[num]

print("정답:", dynamic_prog(n))

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
4
1 3 1 5

-> 8


4
3 1 2 3

-> 6
'''