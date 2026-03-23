def solution(k, m, score):
    answer = 0
    w = len(score)//m
    score.sort(reverse=True)
    a = [score[i] for i in range(m*w)]
    for j in range(len(a)):
        if (j+1) % m == 0:
            answer += a[j] * m
    return answer