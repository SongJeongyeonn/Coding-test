import sys
input = sys.stdin.readline
n = int(input())
people = list(map(int, input().split()))
people.sort()
res = 0
for i in range(1, n):
    people[i] += people[i-1]
print(sum(people))