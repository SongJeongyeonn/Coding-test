def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        count = sum(1 for j in range(1,i+1) if i % j == 0)
        answer += i if count % 2 == 0 else -i
    return answer