def solution(s):
    answer = 0
    word = ''
    num = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(len(s)):
        if ord(s[i]) >= 97:
            word += s[i]
            if word in num:
                answer = answer * 10 + num.index(word)
                word = ''
        else:
            answer = answer * 10 + int(s[i])
    return answer