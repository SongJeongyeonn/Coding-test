def solution(arr):
    answer = [arr[i] for i in range(len(arr)-1) if arr[i] != arr[i+1]]
    answer.append(arr[-1])
    return answer