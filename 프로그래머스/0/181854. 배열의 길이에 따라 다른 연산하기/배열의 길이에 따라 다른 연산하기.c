#include <stdio.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len, int n) {
    int* answer = (int*)malloc(sizeof(int)*arr_len);
    if(arr_len%2 == 0)
        for(int i = 0; i < arr_len; i++){
        if(i % 2 != 0)
            answer[i] = arr[i]+n;
        else
            answer[i] = arr[i];
    }
    else
        for(int i = 0; i < arr_len; i++){
        if(i % 2 == 0)
            answer[i] = arr[i]+n;
        else
            answer[i] = arr[i];
    }
    return answer;
}