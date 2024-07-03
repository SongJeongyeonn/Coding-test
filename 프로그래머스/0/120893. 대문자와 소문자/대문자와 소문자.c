#include <stdio.h>
// 대문자는 소문자, 소문자는 대문자로만 변환하면 된다.
char* solution(const char* my_string) {
    int len = strlen(my_string);
    char* answer = (char*)malloc(sizeof(char) * (len + 1));
    for(int i = 0; i < len; i++){
        if(my_string[i] >= 65 && my_string[i] <= 90)
            answer[i] = my_string[i] + 32;
        else
            answer[i] = my_string[i] - 32;
    }
    answer[len] = '\0';
    
    return answer;
}