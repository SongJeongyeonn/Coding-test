#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len)
{
    int sum1 = 0, sum2 = 0;
    int answer = 0;
    for(int i = 0; i < num_list_len; i++)
    {
        scanf("%d", &num_list[i]);
        if(i%2 == 0)
            sum1 += num_list[i];
        else
            sum2 += num_list[i];    
    }
    if(sum1 < sum2)
    {
        answer = sum2;
    }
    else
    {
        answer = sum1;
    }
    
    return answer;
}