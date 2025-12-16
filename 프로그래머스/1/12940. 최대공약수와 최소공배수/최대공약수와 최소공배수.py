def GCD(x, y):
    while y:
        x, y = y, x % y
    return x

def solution(n, m):
    return [GCD(n, m), (n * m) // GCD(n, m)]