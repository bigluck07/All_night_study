'''
점프 점프
 
시간 제한	메모리 제한	
2 초	    512 MB	

문제
영우는 지금 n개의 돌이 일렬로 놓여있는 돌다리에 있다. 
그리고 돌다리의 돌에는 숫자가 하나씩 적혀있다. 
영우는 이 숫자가 적혀있는 만큼 왼쪽이나 오른쪽으로 점프할 수 있는데, 
이때 돌다리 밖으로 나갈 수는 없다.

영우는 이 돌다리에서 자기가 방문 가능한 돌들의 개수를 알고 싶어한다. 
방문 가능하다는 것은 현재위치에서 다른 돌을 적절히 밟아 해당하는 위치로 이동이 가능하다는 뜻이다.

현재 위치가 주어졌을 때, 영우가 방문 가능한 돌들의 개수를 출력하시오.

입력
첫 번째 줄에는 돌다리의 돌 개수 n이 주어진다.(1≤n≤100,000) 
    돌의 번호는 왼쪽부터 1번에서 n번이다. 
다음 줄에는 그 위치에서 점프할 수 있는 거리 Ai가 주어진다.(1≤Ai≤100,000)
다음 줄에는 출발점 s가 주어진다.(1≤s≤n)

출력
영우가 방문 가능한 돌들의 개수를 출력하시오.

예제 입력 1 
5
1 4 2 2 1
3
예제 출력 1 
5
'''

import sys
from collections import deque

n = int(sys.stdin.readline().strip())
A_ls = [0]+list(map(int, sys.stdin.readline().strip().split()))
s = int(sys.stdin.readline().strip())
visited = [0 for _ in range(len(A_ls))]
visited[s] = 1
hp = deque([s]) # 위치

while hp:
    idx = hp.popleft()
    point = A_ls[idx]
    left = idx-point
    right = idx+point
    if  0 < left < len(A_ls): # 돌다리밖 체크
        if visited[left] == 0:
            visited[left]=1
            hp.append(left)
    if  0 < right < len(A_ls): # 돌다리밖 체크
        if visited[right] == 0:
            visited[right]=1
            hp.append(right)
            
print(sum(visited))
