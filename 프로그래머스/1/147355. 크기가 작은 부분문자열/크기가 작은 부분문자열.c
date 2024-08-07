#include <stdio.h>
#include <stdlib.h>

int solution(const char* t, const char* p) {
    int answer = 0, len1 = strlen(p), len2 = strlen(t);
    long long p_num = atoll(p), tem_num;
    char tem[len1 + 1];
    for(int i = 0; i <= len2-len1; i++){
        strncpy(tem, t+i , len1);
        tem[len1] = '\0';
        tem_num = atoll(tem);
        if(tem_num <= p_num)
               answer++;
        }
    return answer;
}