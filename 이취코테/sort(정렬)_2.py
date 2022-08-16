'''
문제 2 - 성적이 낮은 순서로 학생 출력하기
- 풀이 20분, 시간제한 1초, 메모리제한 128MB, 기출 D 기업 프로그래밍 콘테스트 예선

n명의 학생정보(이름, 성적)이 주어질 때 학생의 성적이 낮은 순서로 학생의 이름을 출력하는 프로그램을 작성하시오

- 입력조건
	- 첫째 줄: 학생의 수(1<=n<=100,000) 
    - 둘째 줄 ~ n+1째 줄: 이름과 성적이 공백을 기준으로 입력(이름의 길이와 성적은 100이하의 자연수)
                
- 출력조건
모든 학생의 이름을 성적이 낮은순으로 출력하며, 성적이 동일하면 자유로운 순서로 출력한다.

'''
import sys
import time
import psutil
import numpy as np

def memory_usage(message: str = 'debug'):
    # current process RAM usage
    p = psutil.Process()
    rss = p.memory_info().rss / 2 ** 20 # Bytes to MB
    print(f"[{message}] memory usage: {rss: 10.5f} MB")  
      
n = int(sys.stdin.readline().rstrip())
start_time = time.time()
scr_name = {}
name_sct = {}
for _ in range(n):
    name, score = map(str, sys.stdin.readline().rstrip().split())
    score = int(score)
    try:
        scr_name[score].append(name)
        name_sct[name].append(score)
    except:
        scr_name[score] = [name]
        name_sct[name] = [score]
        
# 메소드 사용
import collections
sorted_dict = collections.OrderedDict(name_sct) # {이름:성적} 딕셔너리넣기
names = list(sorted_dict.keys())
print("정답(메소드):", *names[::-1], end=' ')
print(' ')

# 삽입정렬
def insrt_sort(score_name): # {점수:이름}
    ls = list(score_name.keys())
    res = []
    for i in range(1, len(ls)):
        while ls[i] < ls[i-1]:
            ls[i], ls[i-1] = ls[i-1], ls[i]
            i-=1
            if i == 0:
                break
    for i in ls:
        res+=score_name[i]
    return res
print("정답(삽입정렬):", *insrt_sort(scr_name), end=' ')       
print(' ')

# 계수정렬
def insrt_sort(score_name):
    ls = list(score_name.keys()) # 95, 77
    res = [[]]*101
    ans = []
    for i in ls:
        res[i]=score_name[i]
    for i in res:
        if i != []:
            ans+=i
    return ans

print("정답(계수정렬):", *insrt_sort(scr_name), end=' ')       
print(' ')

end_time = time.time()
print(("time :", end_time-start_time))
memory_usage('#1')

'''
2
홍길동 95
이순신 77

-> 이순신, 홍길동



정답(메소드): 이순신 홍길동
정답(삽입정렬): 이순신 홍길동
정답(계수정렬): 이순신 홍길동
('time :', 0.46736621856689453)
[#1] memory usage:   22.96094 MB
'''