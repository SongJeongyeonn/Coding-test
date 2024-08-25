#include <stdio.h>
#include <stdlib.h>

char* solution(const char* my_string, int k) {
    int len = strlen(my_string);
    char* answer = (char*)malloc(sizeof(char)*(len+1)*k);
    for(int i = 0; i < len*k; i++){
        answer[i] = my_string[i%len];
    }
    return answer;
}