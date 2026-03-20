import sys
from collections import deque
input = sys.stdin.readline
n,m = map(int, input().split())
maze = list(list(input().strip()) for _ in range(n))
dirs = [(1,0),(-1,0),(0,1),(0,-1)] # 기본 조건 4가지?
q = deque([(0,0,1)])
visited = [[False] * m for _ in range(n)]
visited[0][0] = True

# 방문, 범위 유효성, 벽인지 확인.
while q:
    x, y, dist = q.popleft()
    if x == n-1 and y == m-1: # 목적지 도착 시 탈출.
        print(dist)
        break
    for dx,dy in dirs: # 아니면 조건을 찾으러 for문 돌림
        nx, ny = x + dx, y + dy # 기본조건 붙이기
        if -1 < nx < n and -1 < ny < m and maze[nx][ny] != '0' and not visited[nx][ny]:# 그 조건이 유효한지 검토
            visited[nx][ny] = True
            q.append((nx, ny, dist+1))