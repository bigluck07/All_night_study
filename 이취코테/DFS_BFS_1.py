'''
문제 1 - 음료수 얼려 먹기
- 풀이 30분, 시간제한 1초, 메모리제한 128MB

N*M 크기의 얼음틀에 구멍이 뚫려있는 부분0, 칸막이는 1로 표시된다.
0끼리 상하좌우 붙어있는 경우 서로 연결되어 있다고 간주하고 생성되는 아이스크림의 개수를 구하시오

- 예시
    4 5
    00110
    00011
    11111
    00000
    
    -> 3개

- 입력조건
	- 첫째 줄: N(세로), M(가로)이 공백을 기준으로 입력 (1<=N,M<=1,000)
    - 둘째 줄 ~ N+1째 줄: 얼음틀의 형태
                
- 출력조건
첫 줄에 정답 출력

'''
import sys
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n,m = map(int, sys.stdin.readline().rstrip().split())
ice_maker = [list(map(int, sys.stdin.readline().rstrip())) for i in range(n)]
print(ice_maker)
start_time = time.time()

def dfs(x,y):
    if x<=-1 or x>= n or y<=-1 or y>=m:
        return False

    if ice_maker[x][y] == 0:
        ice_maker[x][y]=1
        dfs(x-1,y)
        dfs(x,y-1)
        dfs(x+1,y)
        dfs(x,y+1)
        return True
    return False


cnt = 0
for i in range(n):
    for j in range(m):
        if dfs(i,j) == True:
            cnt+=1


print("정답:", cnt)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
15 14
00000111100000
11111101111110
11011101101110
11011101100000
11011111111111
11011111111100
11000000011111
01111111111111
00000000011111
01111111111000
00011111111000
00000001111000
11111111110011
11100011111111
11100011111111
'''