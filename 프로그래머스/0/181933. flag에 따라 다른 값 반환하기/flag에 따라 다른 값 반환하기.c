#include <stdio.h>
#include <stdbool.h>

int solution(int a, int b, bool flag) {
    int answer = flag == 1 ? a+b : a-b;
    return answer;
}