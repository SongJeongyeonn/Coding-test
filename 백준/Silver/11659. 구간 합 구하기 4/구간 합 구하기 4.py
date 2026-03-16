import sys
input = sys.stdin.readline
a,b = map(int, input().split())
num = list(map(int, input().split()))
sum = []
sum.append(num[0])
for i in range(1,a):
    sum.append(sum[i-1]+num[i])
for j in range(b):
    n,m = map(int, input().split())
    if n == 1:
        print(sum[m-1])
    else:
        print(sum[m-1]-sum[n-2])