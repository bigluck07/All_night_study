'''
체육복

점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 
다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 
체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

제한사항
- 전체 학생의 수는 2명 이상 30명 이하입니다.
- 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
- 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
- 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
- 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 
  이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
  
예시
n   lost    reserve     return
5   [2,4]   [1,3,5]     5
5   [2,4]   [3]         4
3   [3]     [1]         2

예시설명
예제 #1
1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.

예제 #2
3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.

힌트 - https://school.programmers.co.kr/learn/courses/14743/14743-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%97%B0%EC%8A%B5-%ED%9E%8C%ED%8A%B8-%EB%AA%A8%EC%9D%8C%EC%A7%91?itm_content=lesson42862
'''

from ast import Str
import sys, copy, time, psutil
from itertools import permutations
from collections import deque

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")

n = int(sys.stdin.readline().rstrip())
lost = list(map(int, sys.stdin.readline().rstrip().split()))
reserve = list(map(int, sys.stdin.readline().rstrip().split()))
start_time = time.time()

def solution(n, lost, reserve):
    '''
    의사코드
    여분학생 == 도난학생 -> 리스트 삭제
    여분학생 리스트를 반복문 돌리고, +-1인 도난학생을 도난리스트에서 삭제한다
    남은 도난 리스트의 값을 총 학생수에서 뺀 나머지를 반환한다
    
    '''
    answer = n
    for i in lost:
        if i in reserve:
            lost.remove(i)
            reserve.remove(i)
    
    lost.sort()
    reserve.sort()
    for i in reserve:
        if i == 1:
            i+=1
            if i in lost:
                lost.remove(i)
        else:
            up = i+1
            down = i-1
            if down in lost:
                lost.remove(down)
            elif up in lost:
                lost.remove(up)
            
    if len(lost) > 0:
        answer-=len(lost)
    
    return answer


print("정답:", solution(n, lost, reserve))
end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
5   2 4   1 3 5     5
5   2 4   3         4
3   3     1         2


'''