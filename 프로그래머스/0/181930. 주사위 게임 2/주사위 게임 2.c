#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b, int c) {
    int answer = (a == b && b == c) ? (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c) : (a!=b && b!=c && a!=c) ? (a+b+c) : (a+b+c)*(a*a+b*b+c*c);
    return answer;
}