'''
브루트포스_소수상근수
 
시간 제한	메모리 제한	
1 초	    256 MB	

문제
양의 정수 n의 각 자리수의 제곱의 합을 계산한다. 그렇게 해서 나온 합도 각 자리수의 제곱의 합을 계산한다. 
이렇게 반복해서 1이 나온다면, n을 상근수라고 한다.

700은 상근수이다.
72 + 02 + 02 = 49
42 + 92 = 97
92 + 72 = 130
12 + 32 + 02 = 10
12 + 02 = 1

2는 상근수가 아니다.
22 = 4
42 = 16
12 + 62 = 37
32 + 72 = 58
52 + 82 = 89
82 + 92 = 145
12 + 42 + 52 = 42
42 + 22 = 20
22 + 02 = 4
42 = 16
... 끝나지 않는다

소수는 1과 자기자신을 제외하고 약수가 없는 수이다. 2, 3, 5, 7, 11, 13, 17, 19, ... 는 소수이다.
소수상근수는 소수이면서 상근수인 숫자이다. 7, 13, 19, ... 는 소수 상근수이다.
n이 주어졌을 때, n보다 작거나 같은 모든 소수상근수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (10 ≤ n ≤ 1000000)이 주어진다.

출력
n보다 작거나 같은 소수상근수를 한 줄에 하나씩 오름차순으로 출력한다.

예제 입력 1 
20
예제 출력 1 
7
13
19
'''

import sys, math

n = int(sys.stdin.readline().strip())
root_num = [0]*1000001
not_root_num = [0]*1000001
answer = []
prime_num = [0]*1000001
def check_prime(num): # 소수체크
    for i in range(2, int(math.sqrt(num))+1): # 제곱근까지 확인
        if num % i == 0: # 입력받은 값 외에 나눠 떨어지면 소수 아님
            return False 
    return True

def check_root(num): # 상근수 체크
    global not_root_num
    num_st = str(num)
    path = []
    state = False
    num = 0
    while True:
        for i in num_st:
            if i == 0:
                continue
            num+=(int(i)**2)
        if num == root_num[num]: 
            state = True
            break
        if num == not_root_num[num]:
            break
        if num in path: # 상근수 아님
            for j in path:
                not_root_num[j] = i
            break
        elif num == 1: # 상근수 임
            root_num[num] = num
            state = True
            break
        else:
            num_st = str(num)
            path.append(num)
            num = 0
            continue
    return state

for i in range(3, n+1):
    if i == prime_num[i]:
        if i == not_root_num[i]:
            continue
        elif check_root(i):
            answer.append(i)
        else:
            not_root_num[i] = i
    else:
        if check_prime(i):
            prime_num[i] == i
            if i == not_root_num[i]:
                continue
            elif check_root(i):
                answer.append(i)
            else:
                not_root_num[i] = i

print(*answer, end='\n')