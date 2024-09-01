#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b) {
    char str1[7], str2[7];
    char res1[14], res2[14];
    sprintf(str1, "%d", a);
    sprintf(str2, "%d", b);
    
    strcpy(res1, str1);
    strcat(res1, str2);
    strcpy(res2, str2);
    strcat(res2, str1);
    
    a = atoi(res1);
    b = atoi(res2);
    int answer = a > b ? a : b;
    return answer;
}