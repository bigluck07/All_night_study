'''
문제 4 - 모험가 길드 *
- 풀이 30분, 시간제한 1초, 메모리제한 128MB, 기출 핵심 유형

공포도x인 모험가는 x명 이상 파티를 맺어야 사냥을 갈 수 있다.
최대 몇개의 파티를 만들 수 있는가
(모든 모험가가 사냥을 갈 필요는 없다)

- 예시

예시1
5
2 3 1 2 2
-> 2

- 입력
    첫째 줄: 모험가 수 N (1<=N<=100,000)
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
n = map(int, sys.stdin.readline().rstrip())
people = list(map(int, sys.stdin.readline().rstrip().split()))

start_time = time.time()

people = Counter(people)

peopl_ls = sorted(list(people.keys()))
for i in peopl_ls:
    if i == 1:
        result += people[i]
    else:
        result += people[i]//i
        people[i] = people[i]%i
        if people[i] != 0:
            j = i
            while True:
                j+=1
                if j in people:     
                    people[j]+=people[i]
                    people[i] = 0
                    break
            
print(people)
print("정답:", result)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''

5
2 3 1 2 2

10
1 3 4 4 4 4 5 5 5 5

10
2 3 4 4 4 4 6 6 6 6


'''
