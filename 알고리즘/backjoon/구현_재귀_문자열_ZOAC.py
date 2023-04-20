'''
ZOAC
 
시간 제한	메모리 제한	
1 초	256 MB	

문제
문자열을 보여주는 새로운 규칙

아직 보여주지 않은 문자 중 추가했을 때의 문자열이 사전 순으로 가장 앞에 오도록 하는 문자를 보여주는 것이다.
예를 들어 ZOAC를 보여주고 싶다면, A → AC → OAC → ZOAC 순으로 보여주면 된다.



입력
첫 번째 줄에 알파벳 대문자로 구성된 문자열이 주어진다. 문자열의 길이는 최대 100자이다.

출력
규칙에 맞게 순서대로 문자열을 출력한다.

예제 입력 1 
ZOAC
예제 출력 1 
A
AC
OAC
ZOAC

예제 입력 2 
BAC
예제 출력 2 
A
AC
BAC

예제 입력 3 
STARTLINK
예제 출력 3 
A
AI
AIK
AINK
ALINK
ARLINK
ARTLINK
SARTLINK
STARTLINK
'''


import sys

k = str(sys.stdin.readline().strip())
visited = [False] * len(k)


def solve(l, r):
    if l==r:
        return
    
    min_s = min(k[l:r])
    min_idx = k[l:r].index(min_s)+l
    visited[min_idx] = True
    
    for i in range(len(k)):
        if visited[i]:
            print(k[i], end="")
    print()
    
    solve(min_idx+1, r)
    solve(l, min_idx)    

solve(0, len(k))