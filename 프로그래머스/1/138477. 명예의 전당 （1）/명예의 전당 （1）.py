def solution(k, score):
    temp = []
    answer = []
    for i in range(len(score)):
        temp.append(score[i])
        temp.sort(reverse=True)
        if i >= k:
            temp.pop()
        answer.append(temp[-1])
    return answer