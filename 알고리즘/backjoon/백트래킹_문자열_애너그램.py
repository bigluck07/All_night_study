'''
애너그램 다국어
 
시간 제한	메모리 제한	
1 초	    128 MB
	
문제
씬디는 애너그램(anagram) 프로그램을 만들어 줄 수 있는 남자를 좋아한다. 참고로 씬디는 매우 예쁘다.

애너그램 프로그램이란, 입력받은 영단어의 철자들로 만들 수 있는 모든 단어를 출력하는 것이다. 
가령 "abc" 를 입력받았다면, "abc", "acb", "bac", "bca", "cab", "cba" 를 출력해야 한다.

입력받은 단어내에 몇몇 철자가 중복될 수 있다. 
이 경우 같은 단어가 여러 번 만들어 질 수 있는데, 한 번만 출력해야 한다.  
또한 출력할 때에 알파벳 순서로 출력해야 한다.

입력
첫째 줄에 단어의 개수 N
둘째 줄부터 N개의 영단어가 들어온다. 영단어는 소문자로 이루어져 있다. 
    단어의 길이는 20보다 작거나 같고, 애너그램의 수가 100,000개 이하인 단어만 입력으로 주어진다.

출력
N개의 영단어에 대한 모든 가능한 애너그램을 출력한다. 
각각의 영단어에 대한 애너그램을 출력할 때, 알파벳 순서로 중복되지 않게 출력한다.

예제 입력 1 
2
abc
acba

예제 출력 1 
abc
acb
bac
bca
cab
cba
aabc
aacb
abac
abca
acab
acba
baac
baca
bcaa
caab
caba
cbaa
'''

import sys, copy
from itertools import permutations

words = [str(sys.stdin.readline().strip()) for _ in range(int(sys.stdin.readline().strip()))] # n*m, 연산수r
    
# for word in words:
#     word = [x for x in word]
#     temp = ["".join(i) for i in set(permutations(word, len(word)))]
#     answer = sorted(temp)
    
#     print(*answer, sep="\n")
    
def permut(l, s):
    global visited, alp
    if l == 0:
        visited.add(s)
        return
    
    for i in range(26):
        if alp[i] > 0:
            alp[i]-=1
            permut(l-1, s+chr(i+97))
            alp[i]+=1

for word in words:
    visited = set()
    alp = [0 for _ in range(26)]
    for x in word:
        alp[ord(x)-97]+=1
    permut(len(word), '')
    
    print(*sorted(list(visited)), sep='\n')