'''
문제 1 - 상하좌우
- 풀이 15분, 시간제한 1초, 메모리제한 120MB

1*1 크기의 사각형으로 나눠진 N*N 정사각형의 공간이 있다. 
좌측 최상단의 좌표는 (1,1)이며 이를 시작점으로하여 움직임을 의미하는 데이터가 들어올 때,
마지막 움직임이 끝나 좌표값을 출력하시오.(단, 좌표평면을 벗어나는 움직임은 무시된다.)
움직임 1칸 단위로 이동하며, 의미는 아래와 같다.
 - L: 좌측이동
 - R: 우측이동
 - U: 상측이동
 - D: 하측이동


- 예시
5
R R R U D D

3 4


- 입력조건
	- 첫째 줄에 공간의 크기 N이 입력된다.(1 <= N <= 100)
	- 둘째 줄에 이동계획이 공백을 사이에 두고 입력된다(1 <= 이동횟수 <= 100)


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

# # 원코드 -> 2.9초걸림
# result = [1, 1]
# N = int(sys.stdin.readline())
# roots = list(map(str, sys.stdin.readline().rstrip().split()))
# way = {"R":[0,1], "L":[0,-1], "U":[-1,0], "D":[1,0]}

# for i in roots:
#     a = result[0]+way[i][0]
#     b = result[1]+way[i][1]
#     if a > N or (a < 1):
#         continue
#     if b > N or (b < 1):
#         continue
#     else:
#         result = [a,b]ㄴ
        
# print("정답:", *result)

# 바꾼코드 - 0.68초
x,y = 1, 1
N = int(sys.stdin.readline())
roots = list(map(str, sys.stdin.readline().rstrip().split()))
way = {"R":[0,1], "L":[0,-1], "U":[-1,0], "D":[1,0]}

for i in roots:
    a = x+way[i][0]
    b = y+way[i][1]
    if a > N or (a < 1):
        continue
    if b > N or (b < 1):
        continue
    else:
        x,y  = a,b
print("정답:", a,b)
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
5
R R R U D D
'''