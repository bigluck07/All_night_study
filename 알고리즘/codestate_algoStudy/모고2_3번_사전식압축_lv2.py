'''
프로그래밍3: [2021 모의고사] 사전식 압축_lv2

사전식 압축기법이란 다음의 두 단계로 이루어진 압축기법입니다.
사전 구축: 입력 문자열에서 반복되는 패턴을 찾아 사전에 추가하고 색인번호를 부여합니다.
원문 변환: 원문을 패턴의 색인번호로 구성된 배열로 변환하여 저장합니다.
사전식 압축기법은 구현 방식에 따라 사전 구축을 먼저 완료한 후 완성된 사전으로 원문 변환을 수행할 수도 있고, 
사전 구축과 원문 변환을 동시에 수행할 수도 있습니다.
다음 알고리즘은 'A' 와 'B' 두 종류의 알파벳으로만 이루어진 원문 문자열 text 가 매개변수로 주어질 때, 
사전 구축과 원문 변환을 동시에 수행하는 알고리즘입니다. 이를 구현한 solution 함수를 완성해주세요.

Step 1: 현재 위치를 원문 문자열의 첫 번째 위치로 초기화하고 사전에는 'A' 와 'B' 를 넣어 초기화합니다. 
        이때 'A' 에는 색인번호 0을, 'B' 에는 1을 부여합니다.
Step 2: 문자열의 현재 위치에서부터 사전에 들어있는 가장 긴 패턴과 일치하는 부분문자열 W 를 찾아 해당 색인번호를 저장합니다. 
        만약 원문이 전부 색인번호로 변환 및 저장되었다면 변환된 색인번호 배열을 반환하고 종료합니다.
Step 3: 원문에서 W 바로 다음에 위치한 하나의 문자를 덧붙인 새로운 패턴을 사전에 추가합니다. 이때 추가되는 패턴의 색인번호는 1씩 증가합니다.
Step 4: 현재 위치를 W 의 바로 다음 칸으로 옮긴 후 Step 2로 돌아갑니다.

제한사항
- 1 ≤ text 의 길이 ≤ 300,000
- text 는 'A' 와 'B' 두 종류의 알파벳(대문자)으로만 구성된 문자열입니다.

입출력 예
text            return
"ABABAABAB"     [0,1,2,0,4,1]
"BBAAA"         [1, 1, 0, 4]

입출력 예 설명
https://abounding-saga-4ef.notion.site/s-912a1a57427140a8996a132d034f7873
참고

입출력 예 #1
아래 그림은 입력 문자열 "ABABAABAB"
에 대해 위 알고리즘을 적용하는 과정을 보여줍니다. 
이 예에서 solution 함수가반환해야 할 값은 길이 6인 정수 배열 [0, 1, 2, 0, 4, 1] 입니다.
번호    패턴
0       A
1       B
2       AB
3       BA
4       ABA
5       AA
6       ABAB

입출력 예 #2
입력 문자열 "BBAAA" 에 대해, 최종적으로 변환된 색인번호 배열은 [1, 1, 0, 4]이며, 
완성된 사전은 다음과 같습니다.
번호    패턴
0       A
1       B
2       BB
3       BA
4       AA
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

def solution(text):
    point = 0
    max_num = 2
    patten = {'a':0, 'b':1, 'ab':2,'ba':3,'aa':4} # 패턴의 번호를 찾을 수 있음
    patten_len = {1: ['a','b'], 2:['ab', 'ba','aa'], 3:[]}
    while text:
        
        if 'aaa' in patten: # 패턴있는지 확인
            # 한칸 넘어가지
            p = 0
        else:
            patten['aaa'] = max_num
            max_num+=1
            text = text[len('aaa')-1:]
            'ab'

    answer = ''
    return answer

text = 'ABABAABAB'


print(solution(text))

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
입출력 예
text            return
"ABABAABAB"     [0,1,2,0,4,1]
"BBAAA"         [1, 1, 0, 4]
'''


'''
def solution(text):
    answer = []
    patten = {'A':0, 'B':1} 
    loc = 0
    now = 0
    idx = 2
    for i in range(1, len(text)):
        if text[loc:i] not in patten:
            patten[text[loc:i]] = 
    return answer
'''