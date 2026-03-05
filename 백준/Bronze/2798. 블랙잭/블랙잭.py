# 카드 값 양의 정수 / n장의 카드가 숫자 보이게 놔둠 /숫자 m보다 작으면서 가까운 카드 3장의 합 출력
import sys
input = sys.stdin.readline # stdin이 input보다 속도 빠르니까 이렇게 대입해놓으면 좋음.
n,m = map(int, input().split())
numbers = list(map(int, input().split()))
result = 0
for i in range(n-2): # 그냥 n으로해도 상관 X
    for j in range(i+1,n-1):
        for z in range(j+1,n):
            sum = numbers[i]+numbers[j]+numbers[z]
            if sum <= m:
                result = max(sum, result)
            if result == m:
                break
print(result) # conbination 방식도 있음