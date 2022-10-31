'''
문제 6 - 문자열 뒤집기 *
- 풀이 20분, 시간제한 2초, 메모리제한 128MB, 기출 핵심 유형

0,1로만 이루어진 문자열 s를 모두 같은 숫자로 만들고자 한다.
연속되는 숫자를 한번에 뒤집을 수 있다면, 최소의 행동으로 동일한 숫자로 만들 수 있는 프로그램을 작성하시오

- 예시

예시1
0001100
-> 1

- 입력
    첫째 줄: 0,1 로만 이루어진 문자열 s (1<=N<1,000,000)
    
- 출력조건
    최소 행동 횟수
'''

from ast import Str
import sys, copy, time, psutil
from collections import Counter

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")

result = 0
s = list(map(str, sys.stdin.readline().rstrip()))
start_time = time.time()

cnt = {0:0, 1:0}
point = 0
while s:
    if len(s) == 1:
        cnt[int(s[0])]+=1
        break
    if s[point] == s[point+1]:
        point+=1
    else:
        cnt[int(s[point])]+=1
        s = s[int(point+1)]
        
result = min(cnt.values())

print("정답:", result)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
0001100

1

000110000011000001100
3

010101010101010110
8

010001010101010
'''
