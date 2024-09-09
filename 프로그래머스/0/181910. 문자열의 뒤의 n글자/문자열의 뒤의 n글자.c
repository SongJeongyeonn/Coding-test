#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char* solution(const char* my_string, int n) {
    int len = strlen(my_string), cnt = 0;
    char* answer = (char*)malloc(sizeof(char) * (n+1));
    for(int i = len-n; i < len; i++){
        answer[cnt] = my_string[i];
        cnt++;
    }
    answer[n] = '\0';
    return answer;
}