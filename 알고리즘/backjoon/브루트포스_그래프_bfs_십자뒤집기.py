'''
십자뒤집기 
 
시간 제한	메모리 제한
1 초	    256 MB	

문제
당신에게 3x3 크기의 보드가 주어진다. 각각의 칸은 처음에 흰색 혹은 검은색이다. 
어떤 칸을 클릭한다면 클릭한 칸+인접한 동서남북 네 칸이 (존재한다면) 
검은색에서 흰색으로, 혹은 흰색에서 검은색으로 변할 것이다.

당신은 모든 칸이 흰색인 3x3 보드를 입력으로 주어지는 보드의 형태로 바꾸려고 한다. 
보드를 회전시킬수는 없다.

input1
검 흰 흰
검 검 흰
검 흰 흰

input2
검 검 검
검 흰 흰
흰 흰 검

Figure D.1: 예제 입력

입력
첫 줄에는 테스트 케이스의 숫자 P(0 < P ≤ 50)이 주어진다.
각각의 테스트 케이스에 대해서 세 줄에 걸쳐 한 줄에 세 글자씩이 입력으로 들어온다. 
"*"은 검은색을 뜻하며 "."은 흰색을 뜻한다.

출력
각각의 테스트 케이스에 대해서 흰 보드를 입력에 주어진 보드로 바꾸는 데 필요한 최소 클릭의 횟수를 구하여라.

예제 입력 1 
2
*..
**.
*..
***
*..
..*
예제 출력 1 
1
3
'''

import sys
from collections import deque
'''
그려진걸 0으로 바꾸는 것도 답이지만, 0을 주어진것으로 바꾸는 것도 답임.
그래서 0을 입력값으로 만드는 최소 클릭수를 구함
'''
p = int(sys.stdin.readline().strip())

for a_ in range(p):
    target = ''
    for b_ in range(3):
        word = str(sys.stdin.readline().strip())
        for w in word: # 10진수로 만들기
            if w == '*':
                target+='1'
            else:
                target+='0'
    target_num = int(target, 2) # 2 -> 10
    
    vst = [-1 for i in range(512)] # 방문체크, 512는 111111111의 10진수
    q = deque([0])
    vst[0] = 0
    
    while (q and vst[target_num]==-1):
        now = q.popleft()
        if now == target_num:
            break
        for j in ["110100000","111010000","011001000","100110100","010111010","001011001","000100110","000010111","000001011"]:
            nxt = now ^ int(j,2)
            
            if vst[nxt] == -1:
                vst[nxt] = vst[now]+1
                q.append(nxt)
                
                
    print(vst[target_num])