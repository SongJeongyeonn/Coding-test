def solution(n):
    temp = list(map(int, str(n)))
    temp.sort(reverse = True)
    answer = 0
    for i in range(len(temp)):
        answer = answer*10+temp[i]
    return answer