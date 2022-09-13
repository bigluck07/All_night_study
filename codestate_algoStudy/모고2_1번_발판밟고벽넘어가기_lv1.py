'''
프로그래밍1: [2022 상반기 대학 모의고사] 발판 밟고 벽 넘어가기_Lv
당신은 발판을 일렬로 세워두고 이를 순서대로 밟아 높이가 h 인 벽을 넘어가려고 합니다. 
당신은 한 번에 높이 k 만큼 점프할 수 있으며, 붙어있는 두 발판의 높이 차이가 k 이하라면 두 발판 사이를 점프해서 이동할 수 있습니다. 
높이가 제각기 다른 발판들이 주어졌을 때, 벽을 넘어가기 위해 필요한 발판의 최소 개수를 구하려고 합니다. 
처음 서있는 바닥의 높이는 0입니다.
예를 들어 벽의 높이가 12 이고, 한 번에 점프 가능한 높이가 3, 발판의 높이를 담은 배열이 [2, 3, 6, 7, 8, 10, 11] 로 주어진다면, 
높이가 [3, 6, 7, 10] 인 발판을 고르고 순서대로 일렬로 세우면 4개의 발판을 사용하여 벽을 넘어갈 수 있습니다.
벽을 넘어갈 수 있도록 발판을 선택하는 다른 방법도 있지만, 발판을 4개보다 적게 사용하여 벽을 넘어가는 방법은 없습니다.
벽의 높이를 나타내는 정수 h , 한 번에 점프 가능한 높이를 나타내는 정수 k , 발판의 높이를 담은 정수 배열 boxes 가 매개변수로 주어집니다. 
벽을 넘어가기 위해 선택해야 하는 발판 개수의 최솟값을 return 하도록 solution 함수를 완성해주세요.

제한사항
- 1 ≤ k < h ≤ 100,000,000
- 1 ≤ boxes 의 길이 ≤ 100,000
- 1 ≤ boxes 의 원소 < h
- 발판의 높이는 모두 다릅니다.
- 벽을 넘어갈 수 있도록 발판을 선택하는 방법이 없는 경우, -1을 return 하면 됩니다.

입출력 예
h   k   boxes                           result
12  3   [2, 3, 6, 7, 8, 10, 11]         4
10  1   [9, 8, 7, 6, 5, 4, 3, 2, 1]     9
20  18  [1]                             -1

입출력 예 설명
입출력 예 #1
문제 예시와 같습니다.

입출력 예 #2
한 번에 높이 1만큼 점프할 수 있기 때문에, 1부터 (벽 높이 - 1)까지 높이가 1씩 증가하도록 모든 발판을 배치해야 합니다.
따라서 9를 return 합니다.

입출력 예 #3
주어진 발판을 모두 사용하더라도 벽을 넘을 수 없습니다. 따라서 -1을 return 합니다
'''
import sys, copy, heapq, time, psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")
    
input = sys.stdin.readline
# s = input().rstrip()
start_time = time.time()

def solution(h, k, boxes): # 벽높이, 점프가능높이, 발판배열
    answer = 0
    step = {0:[]}
    path= []
    now = 0
    for i in boxes: #발판 별 몇번을 올라야 하는지 확인
        if i <= k:
            step[0]+=[i]
        else:
            if i%k > 0:
                if i//k in step.keys():
                    step[i//k]+=[i]
                else:
                    step[i//k]=[i]
            else:
                if (i//k)-1 in step.keys():
                    step[(i//k)-1]+=[i]
                else:
                    step[(i//k)-1]=[i]
                    
    for i in sorted(step.keys()):
        if now >= h:
            break
        if now == 0:
            now +=max(step[i])
            path.append(max(step[i]))
        else:
            now +=(max(step[i])-now)
            path.append(max(step[i]))
        answer+=1
        
    if (now+k) < h:
        answer=-1
    return answer

h, k = 12,3 #map(int, input().rstrip().split())
boxes = [2, 3, 6, 7, 8, 10, 11]
print(solution(h, k, boxes))

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
'''
입출력 예
h   k   boxes                           result
12  3   [2, 3, 6, 7, 8, 10, 11]         4
10  1   [9, 8, 7, 6, 5, 4, 3, 2, 1]     9
20  18  [1]                             -1
'''