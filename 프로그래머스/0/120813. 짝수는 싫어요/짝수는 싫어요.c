#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n) {
    int* answer = (int*)malloc(sizeof(int)*(n/2+n%2));
    int cnt = 0;
    for(int i = 1; i <= n; i++)
    {
        if(i%2 == 0)
            continue;
        answer[cnt] = i;
        cnt++;
    } 
    return answer;
}