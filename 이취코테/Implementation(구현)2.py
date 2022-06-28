'''
문제 1 - 왕실의 나이트
- 풀이 20분, 시간제한 1초, 메모리제한 128MB

8*8 좌표평면의 체스판에서 나이트가 움직일 수 있는 경우의 수 찾기
    - 나이트 이동
        1. 수평 2칸 이동 + 수직 1칸
        2. 수직 2칸 이동 + 수평 1칸 

행은 1~8
열은 a~h로 표기

- 예시
    1. a1 -> 2
    2. c2 -> 6



- 입력조건
	- 첫째 줄: 8*8 좌표평면상 나이트의 위치가 문자 2개로 구성된 문자열 입력 

- 출력조건
첫 줄에 정답 출력

'''

import sys
import time
import psutil

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")    


loc = sys.stdin.readline().rstrip()

start_time = time.time()

x, y = int(loc[1]), int(ord(loc[0]) - ord('a')+1)
way = [(-2,-1), (-1,-2), (1,-2), (2,-1), (2,1), (1,2), (-1,2), (-2,1)]

cnt = 0
for i in way:
    a = x+i[1]
    b = y+i[0]
    if a > 8 or (a < 1):
        continue
    if b > 8 or (b < 1):
        continue
    else:
        cnt+=1
print("정답:", cnt)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
a1 -> 2

c2 -> 6

'''