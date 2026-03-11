n = int(input())
numbers = list(map(int, input().split()))
result = 0
for score in numbers:
    result += score/max(numbers)*100
print(result/n)