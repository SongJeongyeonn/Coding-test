def solution(n):
    answer = -1
    for i in range(1, n+1):
        if i*i == n:
            i = i+1
            answer = i*i
            break
        elif n < i*i:
            answer = -1
            break
    return answer