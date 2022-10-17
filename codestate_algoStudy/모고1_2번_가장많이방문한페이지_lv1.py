'''
s: 페이지번호와 앞으로가기(F), 뒤로가기(B)가 공백을 기준으로 문자열 형태로 입력

s를 통해 가장 많이 방문한페이지의 방문횟수를 구하시오

"1 2 3 4 B B 42 B F F"
와 같은 명령문이 주어지면
1. 1번 페이지 이동
2. 2번 페이지 이동
3. 3번 페이지 이동
4. 4번 페이지 이동
5. 뒤로가기(3번 페이지 이동)
6. 뒤로가기(2번 페이지 이동)
7. 42번 페이지 이동
8. 뒤로가기(2번 페이지 이동)
9. 앞으로가기(42번 페이지 이동)
10. 앞으로가기(페이지 없음, 명령 무시)

입력조건
    1<= s <= 10,000
    1<= 페이지 번호 <=99
    첫번째 명령은 항상 페이지 번호
    동일페이지로 이동은 주어지지 않음

예시
1 2 3 4 B B 42 B F F 
-> 1:1, 2:3, 3:2, 4:1, 42:2
->> 3

1 10 B B 20 1 F B B
-> [('1', 4), ('10', 1), ('20', 2)]
->> 4
'''
import operator
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
# def solution(s):
#     answer = 0
#     visited_b = []
#     visited_f = []
#     page_cnt = {s[0]:1}
#     now_page = s[0]
#     s = s.rstrip().split()
#     for i in s[1:]:
#         if i == 'B':
#             if len(visited_b) > 0:
#                 visited_f.append(now_page)
#                 now_page = visited_b.pop()
#                 page_cnt[now_page]+=1
#             else:
#                 continue
#         elif i == 'F':
#             if len(visited_f) > 0:
#                 now_page = visited_f.pop()
#                 visited_b.append(now_page)
#                 page_cnt[now_page]+=1
#             else:
#                 continue
#         else:
#             visited_b.append(now_page)
#             now_page = i
#             if i in page_cnt.keys():
#                 page_cnt[i]+=1
#             else:
#                 page_cnt[i]=1
#             if len(visited_f) > 1:
#                 visited_f = []
                
#     answer = sorted(page_cnt.items(), key=operator.itemgetter(1)) # key=lambda x: x[1])
#     return answer


def solution(s):
    page={}
    back=[]
    front=[]
    point=""
    s = list(map(str, s.split()))
    for i in s:
        if i == 'B':
            if len(back)>0:
                front.append(point)
                point = back.pop()
                page[point]+=1
            else:
                continue
                
        elif 1=='F':
            if len(front)>0:
                back.append(point)
                point = front.pop()
                page[point]+=1
            else:
                continue
        else:
            if point != "":
                back.append(point)
            if i in page.keys():
                page[i]+=1
            else:
                page[i]=1
            point = i
            front=[]
    answer = max(page.values())
    return answer

print(solution(s))

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1') 


from collections import deque

def solution(s):
    answer = 0
    s = s.split()
    front = deque()
    back = deque()
    now = ''
    cnt = {}
    for i in s:
        if i == 'B':
            if len(back) > 0:
                front.append(now)
                now = back.pop()
                cnt[now]+=1
        elif i == 'F':
            if len(front) > 0:
                back.append(now)
                now = front.pop()
                cnt[now]+=1
        else:
            front = deque()
            if i in cnt:
                back.append(now)
                now = i
                cnt[now]+=1
            else:
                if now != '':
                    back.append(now)
                    now = i
                    cnt[now]=1
                else:
                    now = i
                    cnt[now]=1
    cnt = sorted(cnt.items(), key=lambda x: x[1], reverse=True)
    answer = cnt[0][1]
    return answer