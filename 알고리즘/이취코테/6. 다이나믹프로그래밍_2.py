'''
문제 2 - 개미전사
- 풀이 30분, 시간제한 1초, 메모리제한 128MB

개미는 식량이 부족하면 메뚜기마을을 침략하려 한다. 
메뚜기마을의 식량창고는 일렬로 되있고, 정해진 수의 식량을 저장하며,
개미는 선택적으로 약탈할 예정이다.
메뚜기는 인접한 식량창고가 공격받으면 알 수 있는데 
이때 개미가 걸리지 않고 창고털이를 하려면 최소 한 칸 이상 떨어진 창고를 털어야 한다. 
개미가 메뚜기네 창고에서 털 수 있는 최대 식량의 양을 터는 프로그램을 작성시오

- 예시
4
1 3 1 5

-> 8


- 입력조건
	- 첫째 줄: 식량창고의 개수 정수 N(3 <= X <= 100)
    - 둘째 줄: 공백으로 구분된 각 식량창고의 식량 개수 K(0 <= K <= 1,000)
                
- 출력조건
개미가 얻을 수 있는 최대 값

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
arr = list(map(int, sys.stdin.readline().rstrip().split()))


start_time = time.time()

def dynamic_prog(arr):
    num_rule = {} # [None]*len(arr)
    
    num_rule[0] = arr[0]
    num_rule[1] = max(arr[0:2])
    
    for i in range(2, len(arr)):
        num_rule[i] = max(num_rule[i-1], num_rule[i-2]+arr[i]) 
        
    return num_rule[len(arr)-1]

print("정답:", dynamic_prog(arr))

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