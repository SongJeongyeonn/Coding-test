#include <stdio.h>
#include <stdlib.h>

int* solution(const char* s) {
    int len = strlen(s), cnt = 0;
    int* answer = (int*)malloc(sizeof(int)*len);
    for(int i = 0; i < len; i++){
        cnt = 1;
        for(int j = 0; j < i; j++)
            if(s[i] == s[j]){
                answer[i] = i-j;
                cnt = 2;
            }
        if(cnt != 2)
            answer[i] = -1;
    }
    return answer;
}