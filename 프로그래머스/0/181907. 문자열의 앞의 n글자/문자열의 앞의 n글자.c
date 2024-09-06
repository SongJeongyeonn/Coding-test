#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string, int n) {
    char* answer = (char*)malloc(sizeof(char) * (n+1));
    for(int i = 0; i < n; i++)
        answer[i] = my_string[i];
    answer[n] = '\0';
    return answer;
}