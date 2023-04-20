
'''
문제 1
단계 1
단계 2
단계 3
단계 요약
중복 URL 제거한 방문 기록 반환
변경 내용 표시
웹 브라우저의 방문 기록 기능을 개발한다. 방문 기록 기능의 기본 요소는 사용자가 방문한 URL을 기록하는 것과 방문 기록을 근거로 사용자 현재 페이지를 변경하는 것이다. 
직전 조건에서는 사용자의 현재 페이지를 반환하였는데, 이번 조건에서는 사용자의 방문 기록 전체를 반환하도록 수정한다.
방문 기록에 중복된 URL이 있다면, 가장 최근에 방문한 URL 하나를 남기고 이전에 방문한 중복 URL은 제거한다.
(명령어의 추가는 없으며, 명령 구조는 이전 조건과 동일하다.)

명령어	동작
["BACK","1"]	이전으로 1번 이동
["NEXT","1"]	앞으로 1번 이동
["PUSH","midasit.com"]	입력된 현재 페이지로 이동하고 URL을 기록
"BACK", "NEXT" 명령은 이동 횟수를 값으로 입력 받는다.
("BACK"과 "NEXT" 명령으로 더 이상 이동할 수 없다면, 페이지를 이동하지 않는다.)
"PUSH" 명령은 방문하는 URL을 함께 입력 받는다. 추가된 "PUSH" 명령은 입력된 URL을 사용자의 현재 페이지 다음 순서로 기록하며, 입력된 URL로 사용자의 현재 페이지를 변경한다.
(추가로 기록된 URL의 다음 페이지들은 이전 방문 기록에서만 유효하므로 모두 제거된다.)

다음은 명령에 따른 방문 기록과 현재 페이지 변경 규칙을 나타내는 예시이다.

순서	명령	방문 기록	현재 페이지
1	["PUSH","www.domain1.com"]	"www.domain1.com"	"www.domain1.com"
2	["PUSH","www.domain2.com"]	"www.domain1.com",
"www.domain2.com"	"www.domain2.com"
3	["PUSH","www.domain3.com"]	"www.domain1.com",
"www.domain2.com",
"www.domain3.com"	"www.domain3.com"
4	["BACK","1"]	"www.domain1.com",
"www.domain2.com",
"www.domain3.com"	"www.domain2.com"
5	["BACK","1"]	"www.domain1.com",
"www.domain2.com",
"www.domain3.com"	"www.domain1.com"
6	["PUSH","www.domain4.com"]	"www.domain1.com",
"www.domain4.com"	"www.domain4.com"
명령어를 실행하고 사용자의 방문 기록을 반환하는 알고리즘을 작성하시오.
입력
첫 번째 인자로 명령어와 값의 쌍 C1, ..., CN이 이중 배열로 주어진다.
명령어와 값의 쌍은 두 개의 문자열로 구성되며, 첫 번째 인자는 명령어, 두 번째 인자는 명령어 수행에 필요한 값이다.

출력
모든 명령을 수행하고  사용자의 방문 기록 H1, ..., HN을 문자열 배열로 반환한다.

입출력 예제
C	return
[["PUSH","www.google.com"],["PUSH","www.yahoo.com"]]	["www.google.com","www.yahoo.com"]
예제 설명
 "PUSH" 명령을 두 번 수행한 뒤, 사용자의 방문 기록은 ,"www.google.com","www.yahoo.com"이다.

명령	현재 페이지	방문기록
PUSH	"www.google.com"	"www.google.com"
PUSH	"www.yahoo.com"	"www.google.com",
"www.yahoo.com"
'''
# 방문한 URL을 기록하는 것
# 방문 기록을 근거로 사용자 현재 페이지를 변경
# BACK # NEXT # PUSH
from collections import deque

def solution(C): #. 방문 기록 기능을 개발
    answer = []
    back = deque()
    nxt = deque()
    now = ""
    for order, point in C:
        print(order, point)
        print(answer)
        print()

        try:
            point = int(point)
        except:
            pass
        if order == "PUSH":
            if len(answer) == 0:
                now = point
                if now in answer:
                    num = answer.index(now)
                    answer.pop(num)
                    answer = [answer[-1]]
                    continue
                answer.append(now)
            else:
                nxt = deque()
                back.append(now)
                now = point
                if now in answer:
                    num = answer.index(now)
                    answer.pop(num)
                    answer = [answer[-1]]
                    continue
                answer.append(now)
        elif order == "BACK":
            if len(back) > 0:
                while point != 0:
                    point-=1
                    try:
                        nxt.append(now)
                        now = back.pop()
                        if now in answer:
                            num = answer.index(now)
                            answer.pop(num)
                            answer = [answer[-1]]
                            continue
                        answer.append(now)
                    except:
                        break

        elif order == "NEXT":
            if len(nxt) > 0:
                while point != 0:
                    point-=1
                    try:
                        back.append(now)
                        now = nxt.pop()
                        if now in answer:
                            num = answer.index(now)
                            answer.pop(num)
                            answer = [answer[-1]]
                            continue
                        answer.append(now)
                    except:
                        break
    return answer



# 방문한 URL을 기록하는 것
# 방문 기록을 근거로 사용자 현재 페이지를 변경
# BACK # NEXT # PUSH
from collections import deque

def solution(C): #. 방문 기록 기능을 개발
    answer = []
    back = deque()
    nxt = deque()
    now = ""
    for order, point in C:
        print(order, point)
        print(answer)
        print()

        try:
            point = int(point)
        except:
            pass
        if order == "PUSH":
            if len(answer) == 0:
                now = point
                answer.append(now)
            else:
                '''
                back를 이용하는게 좋아보임
                '''
                nxt = deque()
                back.append(now)
                now = point
                if now in answer:
                    answer = [back.pop()]
                answer.append(now)
        elif order == "BACK":
            if len(back) > 0:
                while point != 0:
                    point-=1
                    try:
                        nxt.append(now)
                        now = back.pop()
                    except:
                        break

        elif order == "NEXT":
            if len(nxt) > 0:
                while point != 0:
                    point-=1
                    try:
                        back.append(now)
                        now = nxt.pop()
                        if now in answer:
                            num = answer.index(now)
                            answer.pop(num)
                            answer = [answer[-1]]
                            continue
                        answer.append(now)
                    except:
                        break
    return answers
