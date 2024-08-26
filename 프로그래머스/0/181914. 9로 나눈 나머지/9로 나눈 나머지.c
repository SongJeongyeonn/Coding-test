#include <stdio.h>
#include <stdlib.h>

int solution(const char* number) {
    int answer = 0, len = strlen(number);
    for(int i = 0; i < len; i++){
        answer += number[i]-'0';
    }
    return answer % 9;
}