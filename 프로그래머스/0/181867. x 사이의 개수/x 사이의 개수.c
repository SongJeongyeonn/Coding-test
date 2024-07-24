#include <stdio.h>
#include <stdlib.h>

int* solution(const char* myString) {
    int len = strlen(myString), cnt = 0;
    for(int i = 0; i < len; i++)
        if(myString[i] == 'x')
            cnt++;
    int* answer = (int*)malloc(sizeof(int)*(cnt+1));
    memset(answer, 0, (cnt+1)*sizeof(int));
    cnt = 0;
    for(int i = 0; i < len; i++){
        if(myString[i] != 'x')
            answer[cnt]++;
        else
            cnt++;
    }
    return answer;
}