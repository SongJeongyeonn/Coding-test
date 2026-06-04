def solution(m, n, puddles):
    dp = [[0]*(m+1)]+[[0]+[-1]*m for _ in range(n)]
    dp[1][1] = 1
    for x,y in puddles:
        dp[y][x] = 0
        
    for i in range(1, n+1):
        for j in range(1, m+1):
            if dp[i][j] == -1:
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007
    return dp[i][j]