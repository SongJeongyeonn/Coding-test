#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string, const char* overwrite_string, int s) {
    char* answer = (char*)malloc(sizeof(char)*(strlen(my_string)+1));
    strcpy(answer, my_string);
    for(int i = 0; i < strlen(overwrite_string); i++){
        answer[i+s] = overwrite_string[i];
    }
    return answer;
}