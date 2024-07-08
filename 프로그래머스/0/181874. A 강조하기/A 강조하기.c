#include <stdio.h>
#include <stdlib.h>

char* solution(const char* myString) {
    int len = strlen(myString);
    char* answer = (char*)malloc(sizeof(char)*(len+1));
    strcpy(answer, myString);
    for(int i = 0; i < len; i++){
        if('a' == answer[i])
            answer[i]-=32;
        else if(answer[i] >= 65 && answer[i] <= 90 && 'A' != answer[i])
            answer[i]+=32;
    }
    return answer;
}