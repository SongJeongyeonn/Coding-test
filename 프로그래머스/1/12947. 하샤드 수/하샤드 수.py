def solution(x):
    answer = True
    temp = list(map(int,str(x))) # map(int,)를 안사용하면 문자열을 sum 하려는거라서 type에러 발생
    if x % sum(temp) != 0:
        answer = False
    return answer