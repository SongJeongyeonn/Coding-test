import sys
input = sys.stdin.readline
n,m = map(int, input().split())
# n,m크기의 체스판
# 문제를 제대로 안봤네, 전체 수정이 아니라 8x8 질라내서 정사각형 덧칠하는거네.
# B로 시작하는 경우와 W로 시작하는 경우 2가지가 있음. / 둘 중 작은거 찾아야함.
board = list(list(input().strip()) for i in range(n))

res = float('inf') # 최대값 지정하고 싶을 땐 이렇게
for i in range(n-7):
  for j in range(m-7):
    cnt1 = 0
    cnt2 = 0
    for s1 in range(i, i+8):
      for s2 in range(j, j+8):
        if (s1+s2)%2 == 0:
          if board[s1][s2] != 'W':
            cnt1 += 1 # B
          else:
            cnt2 +=1 # W
        else:
          if board[s1][s2] != 'B':
            cnt1 += 1 # W
          else:
            cnt2 += 1 # B
    res = min(res, cnt1, cnt2)
print(res)