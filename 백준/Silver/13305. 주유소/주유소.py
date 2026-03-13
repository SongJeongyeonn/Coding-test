import sys
input = sys.stdin.readline
n = int(input())-1
road = list(map(int, input().split()))
oil = list(map(int, input().split()))
oil.pop()
res = 0
min_price = oil[0]
for i in range(n):
    if oil[i] < min_price:
        min_price = oil[i]
    res += min_price*road[i]
print(res)