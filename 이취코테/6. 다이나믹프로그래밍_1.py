'''
문제 1 - 1로 만들기
- 풀이 20분, 시간제한 1초, 메모리제한 128MB

정수 X가 주어질때, 1로 만들 수 있는 연산 4가지 중 최소한의 방법을 사용하는 횟수를 출력하시오.
    1. X가 5로 나누어떨어지면, 5로 나눈다.
    2. X가 3로 나누어떨어지면, 3로 나눈다.
    3. X가 2로 나누어떨어지면, 2로 나눈다.
    4. X에서 1을 뺀다.

- 예시

26

-> 3


- 입력조건
	- 첫째 줄: 정수 X(1 <= X <= 30,000)
    - 둘째 줄: n개의 정수(n의 합은 항상 m보다 크다)
                
- 출력조건
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다

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
      
x = int(sys.stdin.readline().rstrip())


start_time = time.time()

num_rule = {1:1}

def dynamic_prog(num):
    if num in num_rule.keys(): # 메모리에 존재하는 경우
        return num_rule[num]
    
    orgin = num
    cnt=0
    while num>1:
        if num in num_rule.keys():
            cnt+=num_rule[num]
        else:
            if num%5 == 0:
                num/=5
            elif num%5 == 1:
                num-=1
            elif num%3 == 0:
                num/=3
            elif num%2 == 0:
                num/=2
            else:
                num-=1
            cnt+=1
    num_rule[orgin] = cnt
    return cnt

def dynamic_prog2(num):
    
    rule = [0]*30001
    
    for i in range(2, num+1):
        rule[i] = rule[i-1]+1
        
        if i%2==0:
            rule[i] = min(rule[i], rule[i//2]+1)
            
        if i%3==0:
            rule[i] = min(rule[i], rule[i//3]+1)
            
        if i%5==0:
            rule[i] = min(rule[i], rule[i//5]+1)
            
    # print(rule)
    return rule[num]

print("정답:", dynamic_prog(x))
end_time1 = time.time()

print(("time :", end_time1-start_time))
memory_usage('#1')

print("정답:", dynamic_prog2(x))
end_time2 = time.time()
print(("time :", end_time2-end_time1))
memory_usage('#1')

'''

26

-> 3
'''