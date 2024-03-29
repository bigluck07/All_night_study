'''
프로그래밍1: [2022 하반기 대학모의고사] 풀하우스 만들기_LV1
특정한 순서대로 주어지는 트럼프 카드들을 모아서 최대한 많은 수의 풀하우스를 만들려고 합니다. 풀하우스는 포커 족보 중 하나로, 같은 숫자 3장과 또 다른 같은 숫자 2장으로 이루어진 카드 조합을 뜻합니다. 예를 들어 [1, 2, 2, 1, 1]은 1이 3장, 2가 2장이므로 풀하우스입니다. [1, 1, 1, 1, 2]는 1이 4장이라서 풀하우스가 아니며, [1, 1, 2, 2, 3]은 어떤 카드도 3장이 아니 기 때문에 풀하우스가 아닙니다.
카드를 한 장씩 주어지는 순서대로 받습니다. 들고 있는 카드 중 5장을 이용해 풀하우스를 만든다면 점수를 1점 얻고, 들고 있던 모든 카드를 버립니다. 만약 들고 있는 카드로 2개 이상의 풀하우스를 만들더라도 한 번에 1점만 얻을 수 있으며, 점수 를 획득하면 들고 있던 모든 카드를 버려야 합니다.
카드 중에는 조커가 포함되어 있습니다. 조커는 어떤 숫자로든 대체할 수 있는 카드입니다. 예를 들어 모은 카드 5장이 [7, 7, Joker, 12, 12]라면, Joker를 7 혹은 12로 대체하여 풀하우스를 완성할 수 있습니다. 이 문제에서는 조커를 0으로 나타냅 니다.
주어지는 카드의 숫자를 순서대로 담고 있는 1차원 정수 배열 cards 가 매개변수로 주어집니다. 풀하우스를 완성하여 최 대 몇 점을 받을 수 있는지 return 하도록 solution 함수를 완성해주세요.

제한사항
1≤ cards 의길이≤1,000 0≤ cards 의원소≤13
0은 조커를 의미합니다.

입출력 예
cards
[11,10,0,3,0,0,10,10,11,11]
1

[0,0,0,0,0]
1

[0,0,1,0]
0


입출력 예 설명
입출력예#1
카드 6장을 받은 후 첫 번째 0을 11로, 두 번째와 세 번째 0을 3으로 바꾸면 [11, 11, 3, 3, 3]으로 풀하우스를 완성할 수 있
습니다.
이후에 주어지는 카드 [10, 10, 11, 11]로는 풀하우스를 완성할 수 없습니다.
풀하우스를 최대 1번 완성할 수 있으므로 1을 return 합니다.

입출력예#2
5장이 모두 조커이기 때문에 어떤 조합으로든 풀하우스를 완성할 수 있습니다. 따라서 1을 return 합니다. 입출력예#3
주어지는 카드가 5장 미만이므로 풀하우스를 완성할 수 없습니다. 따라서 0을 return 합니다.

입출력예#3
주어지는 카드가 5장 미만이므로 풀하우스를 완성할 수 없습니다. 따라서 0을 return 합니다.
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

from collections import defaultdict
def solution(cards): 
    answer=0
    hands = defaultdict(int) 
    if len(cards)<5:
        return 0

    for i in cards:
        hands [i]+=1
        if sum(hands.values()) > 4:
            if 0 in hands: # 조커 확인 
                if hands[0] > 2:
                    answer+=1
                    hands = defaultdict(int) 
                for i in hands.values():
                    if hands[0] == 2 and i >= 2 and i != 0: 
                        answer+=1
                        hands = defaultdict(int)
                    elif hands[0] == 1 and i > 2 and i != 0: 
                        answer+=1
                        hands = defaultdict(int)
            else:
                check=0
                val = list(hands.values()) 
                for i in val:
                    if i >= 2: 
                        check+=1
                    if check >= 2:
                        answer+=1
                        hands = defaultdict(int) 
                        break
            check=0 
        else:
            continue
    return answer

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')


# from collections import defaultdict

# def solution(cards):
#     answer = 0
#     hands = {}
#     for i in cards:
#         if i in hands:
#             hands[int(i)]+=1
#         else:
#             hands[int(i)] = 1
#         hands, answer = checking_hands(hands, answer)
#     return answer

# def checking_hands(hands, answer):
#     if 0 in hands: #조커 있으면
#         if hands[0] == 5:
#             answer+=1
#             hands = {}
#             return hands, answer
#         cnt = sorted(hands.items(), key=lambda x: x[1], reverse=True)
#         cnt = [x for x in cnt if x[0]!=0]
#         if len(cnt) > 1:
#             if (cnt[0][1] + cnt[1][1] + hands[0]) > 4:
#                 answer+=1
#                 hands = {}
#                 return hands, answer
#         else:
#             if (cnt[0][1]+hands[0]) > 4:
#                 answer+=1
#                 hands = {}
#                 return hands, answer
#     else:
#         cnt = sorted(hands.items(), key=lambda x: x[1], reverse=True)
#         cnt = [x for x in cnt if x[0]!=0]
#         if len(cnt) > 1:
#             if (cnt[0][1] + cnt[1][1]) > 4:
#                 answer+=1
#                 hands = {}
#                 return hands, answer
#         else:
#             return hands, answer

# [11,10,0,3,0,0,10,10,11,11]

def solution(cards):
    answer = 0
    hands = {}
    for i in cards:
        if i in hands:
            hands[int(i)]+=1
        else:
            hands[int(i)] = 1

        if 0 in hands: #조커 있으면
            if hands[0] == 5:
                answer+=1
                hands = {}
            cnt = sorted(hands.items(), key=lambda x: x[1], reverse=True)
            cnt = [x for x in cnt if x[0]!=0]
            if len(cnt) > 1:
                if (cnt[0][1] + cnt[1][1] + hands[0]) > 4:
                    answer+=1
                    hands = {}
            elif len(cnt) == 1:
                if (cnt[0][1]+hands[0]) > 4 and (hands[0] > 1):
                    answer+=1
                    hands = {}
        else:
            cnt = sorted(hands.items(), key=lambda x: x[1], reverse=True)
            cnt = [x for x in cnt if x[0]!=0]
            if len(cnt) > 1:
                if (cnt[0][1] + cnt[1][1]) > 4 and (cnt[0][1]>1) and (cnt[1][1]>1):
                    answer+=1
                    hands = {}
    return answer