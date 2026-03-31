# 익은거 1, 안익은거 0, 없는거 -1
import sys
from collections import deque
input = sys.stdin.readline
m,n = map(int, input().split())
tomato = [list(map(int, input().split())) for _ in range(n)]
q = deque()
dirs = [(1,0),(-1,0),(0,1),(0,-1)]
cnt1 = 0
cnt2 = 0

for i in range(n):
    for j in range(m):
        if tomato[i][j] == 1:
            q.append((i, j)) # 1 위치 찾아서 시작지점
        elif tomato[i][j] == 0:
            cnt1 += 1

while q:
    x, y = q.popleft() # 위치 꺼내기
    for dx, dy in dirs:
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < m and tomato[nx][ny] == 0: # 유효범위와 안 익은 거만
            cnt2 += 1
            tomato[nx][ny] = tomato[x][y] + 1 # 날짜 더하기(누적됨)
            q.append((nx, ny)) # 다시 저장.

if cnt1 != cnt2:
    print(-1)
else:
    print(max(map(max,tomato))-1)