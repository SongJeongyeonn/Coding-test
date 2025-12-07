def solution(price, money, count):
    answer = money - sum(price*i for i in range(1,count+1))
    answer = abs(answer) if answer < 0 else 0
    return answer