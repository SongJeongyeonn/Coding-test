def solution(arr, divisor):
    answer = [arr[i] for i in range(0, len(arr)) if arr[i] % divisor == 0]
    answer.append(-1) if len(answer) == 0 else answer.sort()
    return answer