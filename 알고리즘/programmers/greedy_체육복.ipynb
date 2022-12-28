'''
문제 9 - 무지의 먹방 라이브 *
- 풀이 30분, 시간제한 1초, 메모리제한 128MB, 기출 K대회 기출

음식 n개가 있고, 각 음식은 섭취시간이 존재합니다. 아래와 같은 조건을 가지고 먹방을 한다고 한다.
    1. 1번부터 먹기 시작, 순차적으로 음식을 먹음
    2. 마지막 음식을 먹으면 1번부터 리셋
    3. 각 음식을 1초 동안 만 먹고 다음 음식으로 넘어감
    4. 음식이 움직이는 시간은 없다고 가정
    
먹방 중 k초 후 잠시 중단하고 이후 다시 시작할 때 몇번부터 섭취해야 하는지 알고자 한다.
음식섭취시간배열 food_times, 네트워크 장애시간 k가 주어질 때, 몇번부터 다시 섭취하기 시작하는지 return하는 solution 함수를 완성하시오.

제한사항
    - 정확성
        - food_times: 각 음식을 모두 먹는데 필요한 시간(time)이 음식번호 순으로 들어있는 배열(1<= food_times <=2,000, 1<=time<=1,000)
        - k: 방속 중단 시간 자연수(1<=k<=2,000,000)
        - 더 이상 섭취할 음식이 없으면 -1을 반환한다.
    - 효율성
        - 1<=food_times<=200,000
        - 1<=time<=100,000,000
        - 1<=k<=2*10**13


- 예시
food_times  k   result
[3,1,2]     5   1

5
3 1 2
-> 1


예시설명
0-1초: 1번음식 섭취 남은시간 [2,1,2]
1-2초: 2번음식 섭취 남은시간 [2,0,2]
2-3초: 3번음식 섭취 남은시간 [2,0,1]
3-4초: 1번음식 섭취 남은시간 [1,0,1]
4-5초: 3번음식 섭취 남은시간 [1,0,0]
5초 장애
10초: 1번음식 섭취 부터 시작
'''

from ast import Str
import sys, copy, time, psutil
from itertools import permutations
from collections import deque

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")

k = int(sys.stdin.readline().rstrip())
food_times = list(map(int, sys.stdin.readline().rstrip().split()))
start_time = time.time()

# 답은 맞는데 효율성 0점
def solution(food_times, k):
    idx = -1
    q = deque()
    for i in range(len(food_times)):
        q.append(i)
        
    for _ in range(k):
        idx = q.popleft()
        food_times[idx]-=1
        if food_times[idx] != 0:
            q.append(idx)
    if len(q) > 0:
        idx = (q.popleft() + 1)
    else:
        idx= -1
    return idx

'''
정확성: 37.5
효율성: 7.1
합계: 44.6 / 100.0
'''
def solution(food_times, k):
    answer = -1
    time_ls = {i+1:v for i,v in enumerate(food_times)} # 순서:시간
    # print(time_ls)
    while k:
        times = list(time_ls.values())
        min_num = min(times)
        print(times.index(min_num))
        cnt = len(time_ls) * min_num#+ int(times.index(min_num)) # 최저 시간의 앞접시들 순서도 더하도록 하기
        # print(cnt)
        if cnt >= k: # k번 다돌아도 0이되는 음식이 없을 경우
            # ans = sorted([(x,y) for x,y in time_ls.items()], key= lambda x: x[0])
            # idx = k%len(time_ls)
            idx = k%len(time_ls)
            return time_ls[idx+1]
        else: # 돌면 0이 생기는 
            k-=cnt
            time_ls = {k:v-min_num for k,v in time_ls.items() if v-min_num > 0}
            times = time_ls.values()
    if k == 0:
        if sum(times) == 0:
            answer = -1
        elif len(time_ls) >= 1:
            answer = list(time_ls.keys())[k]
    return answer


print("정답:", solution(food_times, k))
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
5
3 1 2

-> 1
'''