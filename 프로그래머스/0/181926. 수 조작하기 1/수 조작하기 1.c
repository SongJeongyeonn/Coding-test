#include <stdio.h>

int solution(int n, const char* control) {
    int answer = n;
    for(int i = 0; i < strlen(control); i++){
        switch(control[i]){
            case 'w':
                ++answer;
                break;
            case 's':
                --answer;
                break;
            case 'd':
                answer+=10;
                break;
            case 'a':
                answer-=10;
                break;
        }
    }
    return answer;
}