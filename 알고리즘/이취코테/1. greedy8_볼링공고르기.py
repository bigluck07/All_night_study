'''
문제 8 - 볼링공 고르기 *
- 풀이 30분, 시간제한 1초, 메모리제한 128MB, 기출 2019 SW 마에스트로 입학 테스트

a,b 두 사람이 서로 다른 무게의 볼링공을 고르고자 한다. 
총 n개의 볼링공이 있고, 같은 무게가 존재할 수 있으며 무게는 1~m까지의 자연수 입니다.
n개의 공의 무게가 주어질 때, 두 사람이 볼링공을 고르는 경우의 수를 구하는 프로그램을 작성하세요

- 예시

5 3
1 3 2 3 2
-> 8

8 5
1 5 4 3 2 4 5 2
-> 25

- 입력
    첫째 줄: 공백으로 구분되는 볼링공 개 수 n, 공의 최대무게m (1<=n<=1,000, 1<=m<=10)
    둘째 줄: 공백으로 구분되는 볼링공의 무개 n개의 k (1<=k<=m)
    
- 출력조건
    같은 무게가 아닌, 볼링공의 조합
'''

from ast import Str
import sys, copy, time, psutil
from itertools import permutations,combinations

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")

amount,max_wight = map(int, sys.stdin.readline().rstrip().split())
wight_ls = list(map(int, sys.stdin.readline().rstrip().split()))
start_time = time.time()

def find_cmb(wight_ls):
    result = []
    num = 0
    for i in wight_ls:
        num+=1
        for j in wight_ls[num:]:
            if i == j:
                continue
            result.append((i,j))
    return len(result)

    
print("정답:", find_cmb(wight_ls))
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
5 3
1 3 2 3 2
-> 8

8 5
1 5 4 3 2 4 5 2
-> 25
'''