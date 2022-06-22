'''
### 문제 1 - 큰 수의 법칙
- 풀이 30분, 시간제한 1초, 메모리제한 120MB, 기출 2019 국가교육기관 코테

다양한 수로 이루어진 배열이 주어질 때 수들을 M번 더해 가장 큰수를 만드는 법칙을 구현하시오
단, 배열의 특정한 인덱스에 해당하는 수가 연속해서 K번을 초과할 수 없으나, 인덱스가 다른 같은 수는 다른 수로 취급한다.

- 예시

[2,4,5,4,6], M=8 , K=3이 주어지면
6+6+6+5+6+6+6+4 = 46이 가장 큰 수 이다.

- 입력

배열의 길이(N), 숫자 반복횟수(M) 사용할 숫자 수(K)
N(2<= N <=1,000), M(1<= M <= 10,000), K(1<= K <=10,000) -> 자연수, 공백으로 구분
N길이의 자연수(1이상 10,000이하) -> 공백으로 구분

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

N,M,K = 5,8,3 # map(int, sys.stdin.readline().split())
data = [2,4,5,4,6] # list(map(int, sys.stdin.readline().split()))

result = 0


data.sort()
first_num = data[-1]
second_num = data[-2]

# # 단순
# if first_num==second_num or M < K:
#     result = first_num*M
# else:
#     while True:
#         for i in range(K):
#             if M == 0:
#                 break
#             result+=first_num
#             M-=1
#         if M==0:
#             break
#         result+=second_num
#         M-=1

# 생각
cnt_f = int(M/(K+1))*K + (M%(K+1)) # (가장큰수 k번 + 두번째큰수 1번) + M을 (k+1)번으로 나눈 나머지 = 가장큰수가 더해질 수 있는 횟수 
cnt_s = M-cnt_f

result = (first_num*cnt_f)+(second_num*cnt_s)


print("정답:",result)

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')