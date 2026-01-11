def solution(sizes):
    answer = [0,0]
    for i in range(len(sizes)):
        sizes[i].sort()
        if sizes[i][0] > answer[0]:
            answer[0] = sizes[i][0]
        if sizes[i][1] > answer[1]:
            answer[1] = sizes[i][1]
    return answer[0] * answer[1]