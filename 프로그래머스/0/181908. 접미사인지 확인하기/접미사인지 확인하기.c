#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string, const char* is_suffix) {
    int len1 = strlen(my_string), len2 = strlen(is_suffix);
    int answer = 1, cnt = 0;
    for(int i = len1-len2; i < len1; i++){
        if(my_string[i] != is_suffix[cnt]){
            answer = 0;
            break;
        }
        cnt++;
    }
    return answer;
}