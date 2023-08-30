'''
두 수의 합
 
시간 제한	메모리 제한	
1 초	128 MB	

문제
여러 개의 서로 다른 정수 S = {a1, a2, …, an} 와 또 다른 정수 K 가 주어졌을 때, 
S 에 속하는 서로 다른 두 개의 정수의 합이 K 에 가장 가까운 두 정수를 구하시오. 

예를 들어, 10 개의 정수
S = { -7, 9, 2, -4, 12, 1, 5, -3, -2, 0}
가 주어졌을 때, K = 8 에 그 합이 가장 가까운 두 정수는 {12, -4} 이다. 

또한 K = 4 에 그 합이 가장 가까운 두 정수는 
{-7, 12}, {9, -4}, {5, -2}, {5, 0}, {1, 2} 등의 다섯 종류가 있다.

여러 개의 서로 다른 정수가 주어졌을 때, 
주어진 정수들 중에서 서로 다른 두 정수의 합이 주어진 또 다른 정수에 
가장 가까운 두 정수의 조합의 수를 계산하는 프로그램을 작성하시오.

입력
프로그램은 표준입력으로 입력을 받는다. 프로그램 입력은 t 개의 테스트 케이스로 구성된다. 

입력의 첫 번째 줄에 테스트 케이스의 개수를 나타내는 정수 t 가 주어진다. 
두 번째 줄부터 두 줄에 한 개의 테스트 케이스에 해당하는 데이터가 주어진다. 
각 테스트 케이스의 
    첫 번째 줄에는 정수 n 과 K (2 ≤ n ≤ 1,000,000, -108 ≤ K ≤ 108 )가 공백 기준 입력
    두 번째 줄에는 n 개의 정수가 공백을 두고 주어짐(최댓값은 108, 최솟값은 -108)

출력
출력은 표준출력(standard output)을 사용한다. 
입력되는 테스트 케이스의 순서대로 다음 줄에 이어서 각 테스트 케이스의 결과를 출력한다. 
각 테스트 케이스의 출력되는 첫 줄에 입력으로 주어진 n 개의 정수들 중에서 
서로 다른 두 정수의 합이 주어진 또 다른 정수 K 에 가장 가까운 두 정수의 조합의 수를 출력한다.

예제 입력 1 
4
10 8
-7 9 2 -4 12 1 5 -3 -2 0
10 4
-7 9 2 -4 12 1 5 -3 -2 0
4 20
1 7 3 5
5 10
3 9 7 1 5

예제 출력 1 
1
5
1
2
'''
import sys
from itertools import combinations

# def binarySearch(arr, target):
#     closest, closestCount = float('inf'), 0
#     for i in range(len(arr)):
#         left, right = i + 1, len(arr) - 1
#         while left <= right:
#             mid = left + (right - left) // 2
#             _sum = arr[i] + arr[mid]
#             if abs(target - _sum) < closest:
#                 closest = abs(target - _sum)
#                 closestCount = 1
#             elif abs(target - _sum) == closest:
#                 closestCount += 1
#             if _sum > target:
#                 right = mid - 1
#             else:
#                 left = mid + 1
#     return closestCount

t  = int(sys.stdin.readline().strip())
for _ in range(t):
    res = {}
    n, k = map(int, sys.stdin.readline().strip().split())
    num_ls = sorted(list(map(int, sys.stdin.readline().strip().split())))
    # print(binarySearch(num_ls, k))
    for x,y in list(combinations(num_ls, 2)):
        try: 
            res[x+y]+=1
        except:
            res[x+y]=1
    try:
        print(res[k])
    except:
        p = 1
        ans = 0
        state = True
        while state:
            if k+p in res:
                ans+=res[k+p]
                state = False
            if k-p in res:
                ans+=res[k-p]
                state = False
        print(ans)
        
        