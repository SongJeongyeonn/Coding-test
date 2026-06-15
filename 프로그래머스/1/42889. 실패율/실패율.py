def solution(N, stages):
    current = [0] * (N + 2)
    for stage in stages:
        current[stage] += 1
    
    fail = []
    total = len(stages) 
    for stage in range(1, N + 1):
        if total > 0:
            rate = current[stage] / total
            fail.append((stage, rate))
            total -= current[stage]
        else:
            fail.append((stage, 0)) # 해당 스테이지에 도달한 플레이어가 없으므로 실패율을 0으로 처리

    fail.sort(key=lambda x: (-x[1], x[0])) # 정렬 우선순위 높은 실패율 내림차순, 다음 스테이지 번호
    return [stage for stage, rate in fail] #  매핑된 것 쌍으로 가져와서 stage 번호만 반환.