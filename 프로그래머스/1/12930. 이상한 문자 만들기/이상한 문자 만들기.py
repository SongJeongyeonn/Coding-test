def solution(s):
    answer = ''
    c = 0
    for i in range(len(s)):
        if s[i] == ' ':
            answer+=s[i]
            c = -1
        elif c % 2 == 0:
            answer += s[i].upper()
        else:
            answer += s[i].lower()
        
        c+=1
    return answer