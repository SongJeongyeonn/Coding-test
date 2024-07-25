#include <stdio.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* myString) {
    int len = strlen(myString);
    char* answer = (char*)malloc(sizeof(char)*(len+1));
    strcpy(answer, myString);
    for(int i = 0; i < len; i++)
        if(myString[i] < 'l')
            answer[i] = 'l';
    return answer;
}