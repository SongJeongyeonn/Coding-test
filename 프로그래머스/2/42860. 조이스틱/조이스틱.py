def solution(name):
    answer = 0
    n = len(name)
    for ch in name:
        answer += min(ord(ch) - ord('A'), ord('Z') - ord(ch) + 1)
    left_right = n - 1
    for idx in range(n):
        next_idx = idx + 1
        while next_idx < n and name[next_idx] == 'A':
            next_idx += 1
        dist = min(idx * 2 + (n - next_idx),(n - next_idx) * 2 + idx)
        left_right = min(left_right, dist)
    return answer + left_right