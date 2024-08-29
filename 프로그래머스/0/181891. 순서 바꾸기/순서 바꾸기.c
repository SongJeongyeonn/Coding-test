#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int num_list[], size_t num_list_len, int n) {
    int cnt = 0;
    int* answer = (int*)malloc(sizeof(int)*num_list_len);
    for(int i = n; i < num_list_len; i++){
        answer[cnt] = num_list[i];
        cnt++;
    }
    for(int i = 0; i < n; i++){
        answer[cnt] = num_list[i];
        cnt++;
    }
    return answer;
}