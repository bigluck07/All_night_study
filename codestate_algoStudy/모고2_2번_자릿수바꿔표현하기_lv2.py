'''
프로그래밍2: [모의고사] 자릿수 바꿔 표현하기_lv2

철수는 N(2 <= N <= 26)진법 수를 표현하는데 필요한 N개의 수를 서로 다른 임의의 소문자 알파벳들로 바꿔 표현하려고합니다. 
그러기 위해 각 수를 어떤 알파벳으로 표현할 것인지에 대한 규칙을 표로 만들어 보았습니다. 
예를 들어, 5진법 수 를 아래와 같은 규칙으로 나타낸다고 하겠습니다.
위의 규칙을 적용하면 5진수 120은 otz가 되고, 5진수 33은 hh가 됩니다.
철수는 음이 아닌 두 개의 N진수 A, B(A >= B)를 자신만의 규칙으로 적었고, A - B를 계산하고 싶습니다. 
규칙 rule과 두 수 A, B를 바꿔 표현한 값이 주어질 때, 철수의 규칙대로 나타낼 때의 A - B를 return 하도록 solution 함수를 완성해주세
요.
(rule[i]는 한 자릿수 i를 철수의 규칙으로 나타낸 값이며, 숫자는 0으로 시작하지 않습니다.)

제한사항
- rule 의 길이는 2 이상 26 이하입니다.
- A 와 B 의 길이는 1 이상 10 이하입니다.
- rule , A , B 는 알파벳 소문자만 포함합니다.
- A 와 B 에 포함되는 각 알파벳은 rule 에 딱 한 번 등장합니다.
- 알파벳으로 나타내기 전의 A 는 B 보다 크거나 같습니다.

입출력 예
rule A B result
zothf otz hh ht
ab ba a ba

입출력 예 설명
입출력 예 #1
otz는 5진수 120이며, hh는 5진수 33입니다. 5진수 120에서 5진수 33을 빼면 5진수 32이기 때문에 A - B 는 ht입니다.

입출력 예 #2
ba는 2진수 10이며, a는 2진수 0이기 때문에 2진수 10에서 2진수 0을 빼면 그대로 2진수 10이 되어 답은 ba가 됩니다.
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

def solution(rule, A, B):
    answer = ''
    nums = len(rule)
    s2n= {}
    n2s = {}
    for i in range(nums):
        n2s[i] = rule[i]
        s2n[rule[i]] = i
        
    A = ''.join([str(s2n[i]) for i in A])
    B = ''.join([str(s2n[i]) for i in B])
    A = int(A,nums)
    B = int(B,nums)
    
    def change_num(A,B,q):
        rev_base = ''
        n= A-B
        while n>0:
            n, mod = divmod(n,nums)
            rev_base+=str(mod)
        return rev_base[::-1]
    
    answer = ''.join([str(n2s[int(i)]) for i in change_num(A,B,nums)])
    return answer

rule = 'zothf'
A, B = 'otz', 'hh'

print(solution(rule, A, B))

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')
'''
입출력 예
rule    A   B   result
zothf   otz hh  ht
ab      ba  a   ba
'''