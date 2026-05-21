def solution(n, lost, reserve):
    new_lost = []

    for i in lost:
        if i in reserve:
            reserve.remove(i)
        else:
            new_lost.append(i)

    answer = n

    new_lost.sort()

    for i in new_lost:
        if i - 1 in reserve:
            reserve.remove(i - 1)

        elif i + 1 in reserve:
            reserve.remove(i + 1)

        else:
            answer -= 1

    return answer
