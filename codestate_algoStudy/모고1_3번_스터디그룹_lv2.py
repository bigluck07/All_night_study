'''
프로그래밍3: [20모의고사] 스터디 그룹_lv 2

현수네 반에서는 스터디 그룹을 만들기로 했습니다. 선생님께서는 한 그룹에 몇 명이 참여해도 좋으며, 
다른 학생과 스터디그룹을 만들고 싶지 않은 학생들은 혼자서 그룹을 구성해도 된다고 하셨습니다. 
학생들은 자신들의 의사에 따라 스터디 그룹을 구성했습니다.

선생님께서는 반장인 현수에게 모든 스터디 그룹에 매주 학습 자료를 전달하기 위해서 
각 그룹의 대표를 한 명씩 선정하여 대표들의 명단을 제출하라고 하셨습니다. 

현수는 임의로 각 그룹에서 한 명씩의 대표를 선발하는 방법을 여러 가지 생각해 보다가, 
각 그룹의 학생들을 출석 번호의 순으로 나열했을 때 가운데에 있는 학생을 그 그룹의 대표로 선정하기로 했습니다. 
그룹의 구성원 수가 짝수인 경우에는 가운데 있다고 할 수 있는 학생이 두 명 있게 되는데, 
이 경우에는 그 둘 중 번호가 작은 쪽을 선정하기로 규칙을 정했습니다.

학생들의 수와 스터디 그룹의 구성이 주어지면 그룹들의 대표 학생들을 알아내어 
그 번호 목록을 반환하는 함수 solution() 을 완성하세요.


함수 solution() 의 입력으로는 다음과 같은 것들이 주어집니다.
1. 학생들의 총 수 n
    - 각 학생에게는 1번부터 n 번까지의 출석번호가 부여되어 있습니다.
2. 스터디 그룹의 구성을 나타내는 배열 t1 과 t2
    - 배열 t1 의 i 번째 원소가 x 이고 배열 t2 의 i 번째 원소가 y 인 경우, 
      x 번 학생과 y 번 학생이 같은 스터디 그룹에 속해 있음을 나타냅니다.

제한사항
- 학생들의 수 n 의 범위는 10 이상 100,000 이하입니다.
- 스터디 그룹 구성을 나타내는 배열 t1 과 t2 의 길이는 서로 같으며, 4 이상 500,000 이하입니다. 
- n 이하의 자연수 k 가 배열 t1 에도 t2 에도 등장하지 않는 경우는 
  번호 k 의 학생이 다른 어떤 학생과도 스터디 그룹을 구성하지 않은 경우, 
  즉 k 번 학생은 혼자서 그룹을 구성한 경우를 의미합니다.
- 함수 solution() 이 리턴해야 할 배열인 answer 는 
  대표 학생들의 번호를 오름차순으로 (작은 것부터 큰 것의 순서로) 정렬한 것으로서, 
  길이는 현수네 반에 구성된 스터디 그룹의 개수와 같습니다.

입출력 예
n t1 t2 answer
10 [9, 4, 4, 4, 7] [2, 10, 7, 6, 3] [1, 2, 5, 6, 8]
10 [6, 3, 4, 9, 2, 7, 5] [4, 2, 8, 2, 1, 10, 3] [3, 6, 7]

입출력 예 설명
입출력 예 #1
이 예에서는 열 명의 학생들이 다섯 개의 스터디 그룹을 만들었습니다. 
1번, 5번, 8번의 학생들은 각각 혼자서 스터디 그룹을 만들었고, 각자 자신의 스터디 그룹의 대표 학생입니다. 
2번 학생은 9번 학생과 둘이서 스터디 그룹을 만들었는데, 번호 순으로 나열했을 때 가운데 학생은 2번이어도 되고 9번이어도 되지만, 
현수가 정한 규칙에 따라 그룹 구성원이 짝수인 경우에는 번호 순서 가운데에서 바로 앞의 학생을 선정하기로 했으므로 
2번 학생이 대표입니다. 그 외의 학생들은 모두 같은 스터디 그룹에 속해 있는데, 
출석 번호의 순서대로 나열하면 3번, 4번, 6번, 7번, 10번입니다. 이 중 가운데 위치인 세 번째에 있는 6번 학생이 대표입니다. 
대표 학생들의 번호를 오름차순으로 나열하면 1번, 2번, 5번, 6번, 8번입니다.

입출력 예 #2
이 예에서는 열 명의 학생들이 세 개의 스터디 그룹을 이룹니다. 
하나의 그룹은 1번, 2번, 3번, 5번, 9번 학생들로 이루어져있어서 3번 학생이 대표합니다. 
다른 하나의 그룹은 4번, 6번, 8번 학생들로 이루어져 있어서 대표는 6번입니다. 
마지막 하나의 그룹은 7번과 10번 학생들로 이루어져 있는데, 규칙에 따라 대표는 7번입니다. 
대표 학생들의 번호를 오름차순으로 나열한 배열인 [3, 6, 7] 을 반환합니다.
'''
import sys, copy, heapq, time, psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")
    
input = sys.stdin.readline
s = input().rstrip()
start_time = time.time()

def solution(n, t1, t2):
    answer = []
    student = [0]*(n+1)
    student[t1[0]] = 1
    student[t2[0]] = 1
    group = [[t1[0], t2[0]]]
    
    # 스터디 그룹 만들기
    for x,y in zip(t1[1:],t2[1:]):
        student[x] = 1
        student[y] = 1
        check = True
        for i in range(len(group)): # 기존그룹에 속했는지 확인
            if x in group[i]:
                group[i].append(y)
                check = False
                break
            elif y in group[i]:
                group[i].append(x)
                check = False
                break
        if check == True:
            group.append([x,y])
        
    for i in range(1, n):
        if student[i] == 0 :
            answer.append(i)
    for i in group:
        i.sort()
        idx = (len(i)-1)//2
        answer.append(i[idx])
        
    answer.sort()
    return answer

print(solution(s))

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')




def find_p(p, x): # 루트노드 찾기
    answer = []
    if p[x] != x:
        p[x] = find_p(p, p[x])
    return p[x]

def union_p(p, a, b):
    answer = []
    a = find_p(p, a)
    b = find_p(p, b)
    if a < b:
        p[b] = a
        idx = -1
        while True:
            if b in p:
                if idx == p.index(b):
                    break
                idx = p.index(b)
                p[idx] = a
            else:
                break
    else:
        p[a] = b
        idx = -1
        while True:
            if a in p:
                if idx == p.index(a):
                    break
                idx = p.index(a)
                p[idx] = b
            else:
                break

def solution(n, t1, t2):
    answer = []
    stud_dict = {}
    students = [0] * (n+1)

    for i in range(1, n+1):
        students[i] = i
    
    t12 = [[min(x,y), max(x,y)] for x,y in zip(t1,t2)]
    t12 = sorted(t12, key=lambda x: (x[0], x[1]))

    for i in t12:
        union_p(students, i[0], i[1])


    for i in range(1, n+1):
        if students[i] in stud_dict:
            stud_dict[students[i]].append(i)
        else:
            stud_dict[students[i]] = [i]


    for i in stud_dict:
        if len(stud_dict[i]) == 1:
            # print(stud_dict[i])
            answer.append(stud_dict[i][0])
        else:
            if (len(stud_dict[i])%2) == 0:
                ans = (len(stud_dict[i])//2)-1
                # print(stud_dict[i])
                answer.append(stud_dict[i][ans])
            else:
                ans = (len(stud_dict[i])//2)
                # print(stud_dict[i])
                answer.append(stud_dict[i][ans])

    answer.sort()
    return answer