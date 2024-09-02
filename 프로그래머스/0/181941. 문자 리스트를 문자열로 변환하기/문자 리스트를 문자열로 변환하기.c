#include <stdio.h>
#include <stdlib.h>

char* solution(const char* arr[], size_t arr_len) {
    char* answer = (char*)malloc(sizeof(char) * (arr_len+1));
    answer[0] = '\0';
    for (int i = 0; i < arr_len; i++) {
        strcat(answer, arr[i]);
    }
    return answer;
}