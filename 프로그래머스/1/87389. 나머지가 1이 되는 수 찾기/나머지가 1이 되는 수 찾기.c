#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int i = 2;
    while(n % i != 1){
        i++; 
    }
    int answer = i;
    return answer;
}