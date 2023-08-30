'''
자원 캐기
 
시간 제한	메모리 제한	
2 초	256 MB	

문제
인류의 차세대 인공지능 자원 캐기 로봇인 WOOK은 인간 대신 자원을 캐는 로봇이다. 
WOOK은 언제나 제한된 범위 내에서 자원을 탐색하며, 
왼쪽 위 (1, 1)부터 오른쪽 아래 (N, M)까지 자원을 탐색한다. 
WOOK은 한 번에 오른쪽 또는 아래쪽으로 한 칸 이동할 수 있으며, 
그 외의 방향으로 움직이는 것은 불가능하다. 

WOOK은 자신이 위치한 (x, y)에 자원이 있는 경우에만 해당 자원을 채취할 수 있다. 
WOOK이 탐사할 영역 정보가 주어질 때, WOOK이 탐색할 수 있는 자원의 최대 숫자를 구해라!

입력
첫째 줄에 WOOK이 탐사할 영역의 세로길이 N(1≤N≤300)과 가로길이 M(1≤M≤300)
다음 N행 M열에 걸쳐 탐사영역에 대한 정보
    숫자는 공백으로 구분된다. (자원은 1, 빈 땅은 0으로 표시된다)

출력
WOOK이 수집할 수 있는 최대 광석의 개수를 출력하라.

예제 입력 1 
5 4
0 1 0 0
0 0 1 0
1 1 0 0
1 0 1 0
1 1 0 0
예제 출력 1 
4

'''


import sys, math

n  = int(sys.stdin.readline().strip())
prime_num = [] # 소수 집합
def check_prime(num):
    for i in range(2, int(math.sqrt(num))+1): # 제곱근까지 확인
        if num % i == 0: # 입력받은 값 외에 나눠 떨어지면 소수 아님
            return False 
    return True

for i in range(2, n+1):
    if check_prime(i):
        prime_num.append(i)

dp = [0 for _ in range(n+1)] # 입력받은 값이 가질 수 있는 소수조합의 수 집합(인덱스로 입력받은 값 접근가능)
dp[0] = 1
for pn in prime_num:
    for i in range(pn, n+1):
        dp[i] = (dp[i] + dp[i-pn]) % 123456789 # 배수에 1씩 넣어주며, 소수+소수의 조합이 가능하면 해당 수를 또 넣어줌

print(dp[n])