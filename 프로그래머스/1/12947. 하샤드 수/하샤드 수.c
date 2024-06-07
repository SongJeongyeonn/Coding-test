#include <stdio.h>
#include <stdbool.h>

bool solution(int x) {
    bool answer = true;
    int sum = 0, temp = x;
while(temp / 10 > 0){
    sum += temp%10;
    temp = (temp-temp%10)/10;
}
    sum += temp%10;
    if(x % sum != 0)
        answer = false;
    return answer;
}