#include <stdio.h>
#include <stdlib.h>

int solution(int a, int b) {
    char arr[20];
    sprintf(arr, "%d%d", a, b);
    int num = atoi(arr);
    int answer = a*b*2 > num ? a*b*2 : num;
    return answer;
}