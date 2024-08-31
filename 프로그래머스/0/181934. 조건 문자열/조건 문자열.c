#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* ineq, const char* eq, int n, int m) {
    int answer = 0;
    if(strcmp(ineq, "<") == 0){
        if(strcmp(eq, "=") == 0)
            answer = n <= m ? 1 : 0;
        else
            answer = n < m ? 1 : 0;
        }
    else{
        if(strcmp(eq, "=") == 0)
            answer = n >= m ? 1 : 0;
        else
            answer = n > m ? 1 : 0;
    }
    return answer;
}