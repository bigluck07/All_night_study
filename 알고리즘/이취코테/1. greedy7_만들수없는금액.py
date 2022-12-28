'''
문제 7 - 만들 수 없는 금액 *
- 풀이 30분, 시간제한 1초, 메모리제한 128MB, 기출 K대회 기출

N개의 동전을 가지고 만들 수 없는 양의 정수 금액 중 최소금액을 구하는 프로그램을 작성하시오


- 예시

5
3 2 1 1 9
-> 8

4
1 2 3 5
-> 13

5
1 2 4 8 16
-> 32

- 입력
    첫째 줄: 동전 개 수 n(1<=n<=1,000)
    둘째 줄: 공백으로 구분되는 n개의 화폐단위 (화폐단위<=1,000,000)
    
- 출력조건
    만들 수 없는 최소 금액
'''

from ast import Str
import sys, copy, time, psutil
from itertools import permutations

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")

n = int(sys.stdin.readline().rstrip())
money_ls = list(map(int, sys.stdin.readline().rstrip().split()))
start_time = time.time()

def find_cntmkMinimum(money_ls):
    if 1 not in money_ls:
        return 1

    test = money_ls.copy()
    for i in range(2, n+1):
        a = list(set(permutations(money_ls, i)))
        a = list(set([sum(x) for x in a]))
        test= list(set(test + a))
    
    test = [0]+test

    for idx, val in enumerate(test):
        if idx != val:
            return idx
    
    return max(test)+1

    
    # grp = 2
    # num = 2
    # test = list(set(permutations(money_ls, grp)))
    # test = list(set([sum(x) for x in test]))
    
    # while True:
    #     print(num)
    #     if num > sum(money_ls):
    #         return -1
        
    #     if max(test) <= num:
    #         grp+=1
    #         test = list(set(permutations(money_ls, grp)))
    #         test = list(set([sum(x) for x in test]))
        
    #     if num in money_ls:
    #         num+=1
    #         continue
        
    #     elif num in test:
    #         num+=1
    #         continue
        
    #     else:
    #         return num
    

        
# result = 0
# find_cntmkMinimum(money_ls)
print("정답:", find_cntmkMinimum(money_ls))
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
5
3 2 1 1 9

8
'''
