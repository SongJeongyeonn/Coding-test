#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    long long answer = 0;
    int temp = a;
    a = a > b ? a : b;
    b = temp < b ? temp : b;
    for(int i = b; i <= a; i++){
        answer += i;
    }
    return answer;
}