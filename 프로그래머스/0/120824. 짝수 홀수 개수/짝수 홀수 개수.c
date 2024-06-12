#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int num_list[], size_t num_list_len) {
    int* answer = (int*)malloc(sizeof(int) * 2);
    int a=0, m=0;
    for(int i = 0; i < num_list_len; i++){
        if(num_list[i] % 2 == 0)
            m++;
        else
            a++;
    }
    answer[0] = m;
    answer[1] = a;
    return answer;
}