#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int t) {
    int answer = n;
    while(t > 0){
        answer *= 2;
        t--;
    }
    return answer;
}