def solution(babbling):
    answer = 0
    say = ["aya", "ye", "woo", "ma"]
    for baby in babbling:
        for s in say:
            if s * 2 not in baby:
                baby = baby.replace(s, ' ')
        if baby.isspace():
            answer += 1
    return answer