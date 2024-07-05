#include <stdio.h>

int solution(int sides[], size_t sides_len) {
    int answer = 0, sum = 0, cnt = 0;
    answer = sides[0] > sides[1] ? sides[0] > sides[2] ? sides[0] : sides[2] : sides[1] > sides[2] ? sides[1] : sides[2];
    for(int i = 0; i < sides_len; i++){
        if(sides[i] != answer || cnt == 1)
            sum += sides[i];
        else
            cnt++;
    }
    answer = sum > answer ? 1 : 2;
    return answer;
}