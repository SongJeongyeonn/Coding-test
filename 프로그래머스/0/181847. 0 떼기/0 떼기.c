#include <stdio.h>
#include <string.h>

char* solution(const char* n_str) {
    int i, cnt = 0;
    char* answer = (char*)malloc(sizeof(char) * (strlen(n_str)+1));
    for(i = 0; i < strlen(n_str); i++){
        if(n_str[i] != '0')
            break;
    }
    for(int j = i; j < strlen(n_str); j++){
        answer[cnt] = n_str[j];
        cnt++;
    }
    answer[cnt] = '\0';
    return answer;
}