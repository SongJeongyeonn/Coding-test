def solution(n, m, section):
    # m 크기만큼 색칠, n 개수만큼  칠하기, section 칠하는 최수값 return 
    answer = 1
    cnt = 0
    for i in range(1,len(section)):
        if section[cnt]-(m-1) <= section[i] <= section[cnt]+(m-1):
            continue;
        else:
            answer+=1
            cnt = i
    return answer