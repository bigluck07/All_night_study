'''
문제 2 - 숫자 카드 게임
- 시간제한 1초, 메모리제한 128MB, 기출 2019 국가교육기관 코테

여러 숫자 카드 중 가장 높은 숫자 한 장을 뽑는 게임으로 다음의 룰을 지켜야 함
1. 숫자 카드가 N(행)*M(열) 형태로 놓여있다.
2. 먼저 뽑고자 하는 카드의 행을 선택한다.
3. 그다음 해당 행의 가장 숫자가 낮은 카드를 뽑아야 한다.
4. 따라서 처음 행을 선택 시, 해당 행의 최쇠 값의 카드가 다른 행의 최소 값 중 가장 큰 수를 골라야 한다.

- 예시

예시1
3 3
3 1 2
4 1 4
2 2 2

정답1
2

예시 2
2 4
7 3 1 8
3 3 3 4

정답2
3

- 입력

첫째 줄에 N과 M이 공백을 기준으로 자연수로 주어진다.(1<= N,M <=100)
둘째 줄부터 N개의 줄에 M개의 숫자가 공백을 기준으로 자연수로 주어진다(1<= 숫자 <=10,000)

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
    
start_time = time.time()

N,M = map(int, sys.stdin.readline().split())
data = []
for i in range(N): data.append(list(map(int, sys.stdin.readline().rstrip().split())))


min_num = min(data[0])
for idx, val in enumerate(data[1:]):
    if min(val) > min_num: min_num = min(val)
    
print("정답:", min_num)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
3 3
3 1 2
4 1 4
2 2 2


2 4
7 3 1 8
3 3 3 4
'''