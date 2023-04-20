'''
뒤풀이
 
시간 제한	메모리 제한	
1 초	    128 MB	

문제
도현이는 이번 대회를 준비하면서 거한 저녁 만찬을 예약했다.

도현이는 우선 각 사람에게 어느 정도 마시면 기분이 좋은지(Li)와, 
어느 정도 마시면 힘든지(Ri)를 물어보았다. 

각 사람은 Li미만의 술을 마시면 술이 부족해 기분이 좋지 않고, 
Ri를 초과하는 술을 마시면 천국으로 가버릴 수도 있다. 

도현이는 각 사람들에게 적당량씩 술을 분배하려고 한다.

도현이는 정확히 T의 술을 결제하였다.

이제 도현이는 모든 사람 i에게 Li이상 Ri이하의 술을 주면서, 
그 총합이 정확히 T가 되도록 술을 분배하려고 한다. 

도현이는 S의 값을 정하고, 
각 사람에게 그 사람이 원하는 술의 양이 얼마이던지 관계없이 S이하의 술만을 주려고 한다. 


1. Li<= i <= Ri
2. 받은 술의 총합이 T
3. S를 초과 불가


만약 그런 값이 여러 개라면, 도현이는 그 중 가장 작은 값을 찾고 싶다.

입력
첫째 줄에 대회 참가자의 수 N과 술의 총량 T가 주어진다. (1 ≤ N ≤ 1000, 1 ≤ T ≤ 109)
둘째 줄부터 N개의 줄에 걸쳐, 각 사람에 대한 Li와 Ri값이 주어진다. (1 ≤ Li ≤ Ri ≤ 106)

출력
만약 S의 값과는 관계없이 항상 불가능하다면 첫째 줄에 -1만을 출력한다.
문제의 조건을 만족하는 S값이 존재한다면 가장 작은 값 하나를 출력한다.

예제 입력 1 
3 10
2 5
4 10
1 3
예제 출력 1 
4
'''

# import sys

# n,t  = map(int, sys.stdin.readline().strip().split())
# lr = [tuple(map(int, sys.stdin.readline().strip().split())) for _ in range(n)]
# lo, hi = 1, 1000000

# def solve(s):
#     L, R = 0, 0
#     for l, r in lr:
#         if l <= s:
#             L+=l;  r+= min(r,s)
#         else: return False
#     if L <= t <= R:
#         return True
#     else:
#         return False


import sys

n,t  = map(int, sys.stdin.readline().strip().split())
lr = [tuple(map(int, sys.stdin.readline().strip().split())) for _ in range(n)]
lo, hi = 1, 1000000
       
def check(s):
    L, R = 0, 0
    for l,r in lr:
        if l <= s:
            L += l; R += min(r,s)
        else: return False
    if L <= t <= R:
        return True
    else:
        return False

while lo<=hi:
    mid = (lo+hi)//2
    if check(mid):
        hi = mid-1
    else:
        lo = mid+1
print(-1 if lo == 1000001 else lo)
