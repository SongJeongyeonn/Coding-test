def solution(n, m, section):
    answer = 1
    cnt = 0
    for i in range(1,len(section)):
        if not(section[cnt]-(m-1) <= section[i] <= section[cnt]+(m-1)):
            answer+=1
            cnt = i
    return answer