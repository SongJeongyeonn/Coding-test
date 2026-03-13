import sys
input = sys.stdin.readline
n = int(input())
times = [list(map(int, input().split())) for i in range(n)]
times.sort()
res = 1
end = times[0][1]
for i in range(1,n):
  if end > times[i][1]:
    end = times[i][1]
  elif times[i][0] >= end:
    end = times[i][1]
    res+=1
print(res)