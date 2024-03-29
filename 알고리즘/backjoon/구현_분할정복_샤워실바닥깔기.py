'''
샤워실 바닥 깔기 
 
시간 제한	메모리 제한	
2 초	    512 MB	

문제
오늘은 민규가 훈련소에 입소하는 날이다. 모든 행사를 마치고 생활관으로 돌아와서 쉬려는데 갑자기 교관이 들어오더니 민규의 이름을 부르는 것이 아닌가. 
당황한 채로 따라갔더니 이번엔 김준서를 아느냐고 물어보았다. 그 녀석이 샤워실 바닥을 깔았는데, 배수구 위치까지 막아버렸다면서 같은 학교 출신인 민규가 다시 깔라는 것이었다.

어떻게 타일을 깔지 고민하던 민규는 샤워실의 구조가 정사각형이면서 한 변의 길이가 2의 제곱수라는 사실을 알아냈다. 
준서는 여기까지만 고려해서 2x2 크기의 타일로 바닥을 전부 채운 것 같은데, 문제는 이렇게 하면 배수구가 있어야 할 위치를 비울 수가 없다는 것이다. 
이런저런 방법을 생각하다가 4칸을 차지하는 정사각형 타일 대신 3칸을 차지하는 ㄱ자 모양의 타일을 사용하면 될 것 같다는 느낌을 받았다.

그런데 ㄱ자 타일을 어떻게 채워야 할까? 생각하다 지친 민규는 여러분에게 이 방법을 찾아달라고 부탁했다. 첫날부터 생활관에서 밤을 새우는 일이 없도록 여러분이 도와주자.

입력
첫 번째 줄에는 바닥의 한 변의 길이를 표현하는 자연수 K(1 ≤ K ≤ 2) 가 주어진다. 
    이때 바닥의 크기는 2K 가 됨에 유의하라. 
두 번째 줄에는 배수구의 위치를 나타내는 자연수 x, y (1 ≤ x, y ≤ 2K)가 공백으로 분리돼서 주어진다. 
    이때 가장 왼쪽 아래가 (1, 1), 가장 오른쪽 위가 (2K, 2K)이다.

출력
각 타일마다 고유한 번호를 매긴 타일의 배치도를 출력한다. 
각 타일의 번호에는 19000 이하의 자연수만을 사용해야 한다. 
배수구가 있는 위치는 -1로 표시한다. 가능한 답 중 하나만 출력하면 된다.

만약 알맞게 타일을 배치하는 방법이 존재하지 않는다면 -1을 출력한다.

예제 입력 1 
1
2 2
예제 출력 1 
1 -1
1 1
예제 입력 2 
2
1 1
예제 출력 2 
4    4    5   5
4    3    3   5
1    1    3   2
-1   1    2   2
예제 입력 3 
2
3 2
예제 출력 3 
4   4   5   5
4   3   3   5
1   3   -1  2
1   1   2   2

힌트
예제 1: 
0 1
0 0
예제 2:
0 0 0 0
0 0 0 0
0 0 0 0
1 0 0 0

예제 3: 
0 0 0 0
0 0 0 0
0 0 1 0
0 0 0 0
'''


import sys

k = int(sys.stdin.readline().strip())
flow = [[0]*2**k for _ in range(2**k)]
x, y = map(int, sys.stdin.readline().strip().split())
flow[2**k-y][x-1] = -1

tiles = [[(0,0), (1,0),(0,1)], [(0,0), (0,1),(1,1)], [(0,0), (1,0),(1,1)], [(0,1), (1,0),(1,1)] ]
num = 1


def solution(x,y,k,area):
    global num
    if k <= 1:
        cnt = 3
        if area == 0 or area==4:
            for i in range(x, x+2):
                for j in range(y, y+2):
                    if not flow[i][j] and cnt:
                        flow[i][j] = num
                        cnt-=1

'''
공간을 나눠서 가장 작은 공간부터 확인할 수 있도록 함. 근데 이게 너무 어려운데...?
분할정복 너무 어렵고....
'''
