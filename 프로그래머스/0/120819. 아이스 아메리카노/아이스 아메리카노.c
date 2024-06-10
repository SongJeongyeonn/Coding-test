#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int money) {
    int i = 0;
    int *answer = (int*) malloc(sizeof(int) * 2);
    while(money >= 5500){
        money -= 5500;
        i++;
    }
    answer[0] = i;
    answer[1] = money;
    return answer;
}