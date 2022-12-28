'''
문제 5 - 곱하기 혹은 더하기 *
- 풀이 30분, 시간제한 1초, 메모리제한 128MB, 기출 페이스북 인터뷰

0~9로만 이루어진 문자열 s를 왼쪽부터 오른쪽까지 한 자리씩 x, + 를 연산하며 가장 큰 값을 구하는 프로그램을 작성하시오
(단, 모든 연산은 왼->오 순차적으로 계산됨)

- 예시
02984    
-> 576
    
567 
-> 210

- 입력
    첫째 줄: 숫자로 이루어진 문자열 s (1<=s길이<=20)
    둘째 줄: 공백으로 구준되는 자연수인 공포값 n개 
    
- 출력조건
    사냥을 갈 수 있는 최대 파티 수
'''

import sys, copy, time, psutil
from collections import Counter

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")

result = 0
s = map(str, sys.stdin.readline().rstrip())
start_time = time.time()

for i in s:
    print(i)
    if (i in ['0','1']) or (result in [0, 1]):
        result+=int(i)
    else:
        result*=int(i)
        
# for i in s:
#     # i = int(i)
#     result = max(result+int(i), result*int(i))
        
print("정답:", result)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''

02984

567  

'''
