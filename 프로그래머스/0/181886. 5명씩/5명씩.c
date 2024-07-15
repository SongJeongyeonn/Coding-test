#include <stdio.h>
#include <stdlib.h>

char** solution(const char* names[], size_t names_len) {
    int cnt = 0;
    for(int i = 0; i < names_len; i+= 5){
        cnt++;
    }
    char** answer = (char**)malloc(sizeof(char*)*cnt);
    int i = 0, j = 0;
    while(cnt > 0){
        answer[j] = (char*)malloc(strlen(names[i]) + 1); 
        strcpy(answer[j], names[i]);
        j++;
        i+=5;
        cnt--;
    }
    return answer;
}