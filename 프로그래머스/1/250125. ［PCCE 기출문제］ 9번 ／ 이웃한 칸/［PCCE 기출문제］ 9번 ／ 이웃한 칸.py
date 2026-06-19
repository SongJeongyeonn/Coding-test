def solution(board, h, w):
    answer = 0
    dh = [-1, 1, 0, 0]
    dw = [0, 0, -1, 1]
    for k in range(4):
        nh = h + dh[k]
        nw = w + dw[k]
        if 0 <= nh < len(board) and 0 <= nw < len(board[0]):
            if board[nh][nw] == board[h][w]:
                answer += 1

    return answer