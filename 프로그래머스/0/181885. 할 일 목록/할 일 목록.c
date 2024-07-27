#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char** solution(const char* todo_list[], size_t todo_list_len, bool finished[], size_t finished_len) {
    int cnt = 0;
    for(int i = 0; i < finished_len; i++)
        if(!finished[i])
            cnt++;
    char** answer = (char**)malloc(sizeof(char*)*(cnt+1));
    cnt = 0;
    for(int i = 0; i < todo_list_len; i++){
        if(!finished[i]){
            answer[cnt] = (char*)malloc(strlen(todo_list[i]) + 1);
            strcpy(answer[cnt], todo_list[i]);
            cnt++;
        }
    }
    return answer;
}