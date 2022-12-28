'''
문제 2 - 커리큘럼 ***
- 풀이 50분, 시간제한 2초

N개의 강의를 수강할 때, 선수강의가 존재하고 동시 여러개의 강의를 들을 수 있다고 할 때,
N개의 강의를 각각 수강하는데 걸리는 시간을 구하는 프로그램을 만드시오


- 입력조건
	- 첫째 줄: n (1 <= n <= 500)
    - 둘째 줄 ~ n+1째 줄: n개의 정보(강의 시간, 선수강의리스트, 끝줄 -1 표기)
                
- 출력조건
N개 강의 모두 수강하는데 걸리는 최소 시간을 한줄에 하나씩 출력

- 예시
5
10 -1
10 1 -1
4 1 -1
4 3 1 -1
3 3 -1

->  10
    20
    14
    18
    17
'''
from collections import deque
import sys, copy
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  

n = map(int, sys.stdin.readline().rstrip()) # 강의 수
class_ls = [list(map(int, sys.stdin.readline().rstrip().split())) for i in range(n)] # 강의 정보
start_time = time.time()

def find_parent(parent, x): # 루트노드 찾기
	if parent[x] != x:
		parent[x] = find_parent(parent, parent[x])
	return parent[x]

def union_parent(parent, a, b): # 두 원소 집합 합치기
	a = find_parent(parent, a)
	b = find_parent(parent, b)
	if a < b:
		parent[b] = a
	else:
		parent[a] = b

class_ls = [0] + class_ls
learning_time = [0] * (n+1)# 강의별 필요시간
graph = [[] for _ in range(n+1)]
indegree = [0] * (n+1) # 진입차수


for i in range(1, n+1):
    learning_time[i] = class_ls[i][0] # 강의 시간입력
    for x in class_ls[i][1:-1]: # 선수과목 확인
        indegree[i]+=1 # 진입차수 증가
        graph[x].append(i) # 간선정보 입력
        
def topology_sort():
    answer = learning_time.copy()
    q = deque()
    for i in range(1, n+1): # 진입차수 0인 경우 큐에 넣기
        if indegree[i] == 0:
            q.append(i)
    while q:
        now = q.popleft()
        for i in graph[now]: # 선수 강의 중 더 시간이 긴 경우 치환
            answer[i] = max(answer[i], answer[now]+learning_time[i])
            indegree[i]-=1
            if indegree[i] == 0:
                q.append(i)
    return answer

ans = topology_sort()
print(*ans, end='\n')



end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
