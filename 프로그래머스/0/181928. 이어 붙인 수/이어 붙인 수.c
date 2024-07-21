#include <stdio.h>
#include <stdlib.h>

int solution(int num_list[], size_t num_list_len) {
    int  answer1 = 0, answer2 = 0;
    for(int i = 0; i < num_list_len; i++){
        if(num_list[i]%2 !=  0){
            answer1 *= 10;
            answer1 += num_list[i];
        }
        else{
            answer2 *= 10;
            answer2 += num_list[i];
        }
    }
    return answer1+answer2;
}