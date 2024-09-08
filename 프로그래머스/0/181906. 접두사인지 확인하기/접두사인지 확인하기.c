#include <stdio.h>
#include <string.h>

int solution(const char* my_string, const char* is_prefix) {
    int answer = 1, len = strlen(is_prefix);
    for(int i = 0; i < len; i++)
        if(my_string[i] != is_prefix[i]){
            answer = 0;
            break;
        }
    return answer;
}