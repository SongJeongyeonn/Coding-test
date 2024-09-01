#include <stdio.h>
#include <stdlib.h>

char* solution(const char* str1, const char* str2) {
    int l = strlen(str1);
    char* answer = (char*)malloc(sizeof(char) * (l*2+1));
    for(int i = 0; i < l*2; i++){
        if(i % 2 == 0)
          answer[i] = str1[i/2];
        else
          answer[i] = str2[i/2];
    }
    answer[l*2] = '\0';
    return answer;
}