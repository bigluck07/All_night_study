import time
import sys
from tkinter.simpledialog import askinteger


n = sys.stdin.readline().rstrip()
start_time = time.time()
knight = {"a":1, "b":2, "c":3, "d":4, "e":5, "f":6, "g":7,"h":8}
x , y = knight[n[0]], int(n[1])
#이동 가능한 방향
move = [(-2,-1),(-2,1),(2,-1),(2,1),(-1,-2),(-1,2),(1,-2),(1,2)]

# print(x,y)

cnt = 0
for i in move:
  x1 = x+i[0]
  y1 = y+i[1]
  if x1>= 1 and x1<=8 and y1>=1 and y1 <= 8 :
    cnt +=1
print(cnt)


end_time = time.time()
print(("time :", end_time-start_time))