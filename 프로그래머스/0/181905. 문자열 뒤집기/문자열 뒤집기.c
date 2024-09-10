#include <stdio.h>
#include <stdlib.h>

char* solution(const char* my_string, int s, int e) {
    int cnt = s, len = strlen(my_string);
    char* answer = (char*)malloc(sizeof(char) * (len+1));
    strcpy(answer, my_string);
    for(int i = e; i >= s; i--){
        answer[cnt] = my_string[i];
        cnt++;
    }
    return answer;
}