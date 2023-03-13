'''
H T T
H T T
T H H
T H H
H H H
H H H
H H H
H T H
H H H

예제 출력 1 
2
-1
4
'''


import sys
from collections import deque

n=3
coin = int('100100011', 2)
print(coin)                         
print("")
coin ^= int(0b100100100 >> 0)
print(int(0b100100100 >> 0))
print(int('000000111', 2))
print(coin)
print("")
coin = int('100100011', 2)
coin ^= int(0b100100100 >> 1)
print(int(0b100100100 >> 1))
print(int('110110001', 2))
print(coin)
print("")
coin = int('100100011', 2)
coin ^= int(0b100100100 >> 2)
print(int(0b100100100 >> 2))
print(int('101101010', 2))
print(coin)
print("")
print(2^2)
