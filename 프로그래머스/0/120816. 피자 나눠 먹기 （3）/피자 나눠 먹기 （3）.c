#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 0;
    while(n > 0){
        n -= slice;
        answer++;
    }
    return answer;
}