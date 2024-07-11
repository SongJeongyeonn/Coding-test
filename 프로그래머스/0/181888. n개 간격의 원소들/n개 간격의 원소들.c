#include <stdio.h>
#include <stdlib.h>

int* solution(int num_list[], size_t num_list_len, int n) {
    int* answer = (int*)malloc(sizeof(int)*num_list_len);
    int cnt = 0;
    for(int i = 0; i < num_list_len; i+=n){
        answer[cnt] = num_list[i];
        cnt++;
    }
    return answer;
}