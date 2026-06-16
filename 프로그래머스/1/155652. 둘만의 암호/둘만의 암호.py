def solution(s, skip, index):
    answer = ''
    for c in s:
        cnt = 0
        now = ord(c)
        while cnt < index:
            now += 1
            if now > ord('z'):
                now = ord('a')
            if chr(now) not in skip: # 문자열에도 in 사용 가능, 배열처럼 사용가능하다.
                cnt += 1
        answer += chr(now)
    return answer