#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string, const char* alp) {
    int len = strlen(my_string);
    char* answer = (char*)malloc(sizeof(char) * (len+1));
    strcpy(answer, my_string);
    for(int i = 0; i < len; i++){
        if(*alp == answer[i])
            answer[i] -= 32;
    }
    return answer;
}