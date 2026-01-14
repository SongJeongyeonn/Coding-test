def solution(s, n):
    answer = ''
    for i in range(len(s)):
        if ord(s[i]) >= 97:
            answer += chr((ord(s[i]) - ord('a') + n) % 26 + ord('a'))
        elif s[i] == ' ':
            answer += s[i]
        else:
            answer += chr((ord(s[i]) - ord('A') + n) % 26 + ord('A'))
    return answer