import sys
input = sys.stdin.readline
n, a = map(int, input().split())
money = []
for i in range(n):
    money.append(int(input()))
money.sort(reverse=True)
res = 0
for j in money:
    res += a // j
    a %= j
    if a == 0:
        break
print(res)