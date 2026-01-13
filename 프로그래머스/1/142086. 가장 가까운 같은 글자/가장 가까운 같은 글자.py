def solution(s):
    return [i-s[:i].rfind(s[i]) if s[:i].rfind(s[i]) > -1  else -1 for i in range(len(s)) ]