#include <stdio.h>

int* solution(int n, int k) {
    int* answer = (int*)malloc(sizeof(int) * (n/k));
    for(int i = 0; i < (n/k); i ++)
        answer[i] = k+(k*i);
    return answer;
}