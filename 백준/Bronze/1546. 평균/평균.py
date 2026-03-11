n = int(input())
numbers = list(map(int, input().split()))
result = sum(numbers)/max(numbers)*100
print(result/n)