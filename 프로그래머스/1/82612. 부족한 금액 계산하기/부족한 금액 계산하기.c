#include <stdio.h>
long long solution(int price, long money, int count) {
    long long answer = 0;
    for(int i = 1; i <= count; i++){
        money -= price*i;
    }
    if(money < 0)
        answer = -1 * money;
    return answer;
}