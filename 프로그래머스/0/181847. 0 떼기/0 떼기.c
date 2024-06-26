#include <stdio.h>
#include <string.h>

char* solution(const char* n_str) {
    int i, cnt = 0, len = strlen(n_str);
    char* answer = (char*)malloc(sizeof(char) * (len+1));
    for(i = 0; i < len; i++){
        if(n_str[i] != '0')
            break;
    }
    for(int j = i; j < len; j++){
        answer[cnt] = n_str[j];
        cnt++;
    }
    answer[cnt] = '\0';
    return answer;
}