def solution(wallet, bill):
    # 지갑보다 지폐가 크면 길이가 긴 쪽을 접기, 홀수면 소수점 버리기, 접힌 지페 90도 돌려서 넣을 수 있음
    answer = 0
    wallet.sort()
    bill.sort()
    while wallet[0] < bill[0] or wallet[1] < bill[1]:
        answer+=1
        bill[1]//=2
        bill.sort()
    return answer