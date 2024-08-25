#include <stdio.h>
#include <stdlib.h>

char* solution(int numLog[], size_t numLog_len) {
    char* answer = (char*)malloc(sizeof(char)*numLog_len);
    int i;
    for(i = 1; i < numLog_len; i++){
        if(numLog[i-1] < numLog[i])
        numLog[i-1] - numLog[i] == -1 ? (answer[i-1] = 'w') : (answer[i-1] = 'd');
        else
            numLog[i-1] - numLog[i] == 1 ? (answer[i-1] = 's') : (answer[i-1] = 'a');
    }
    answer[i-1] = '\0';
    return answer;
}