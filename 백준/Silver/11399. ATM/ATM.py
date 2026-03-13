import sys
input = sys.stdin.readline
n = int(input())
people = list(map(int, input().split()))
people.sort()
res = 0
for i in range(n):
    res += sum(people[j] for j in range(i+1))
print(res)