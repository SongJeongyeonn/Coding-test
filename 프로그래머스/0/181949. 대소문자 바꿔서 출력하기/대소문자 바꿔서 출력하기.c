#include <stdio.h>
#define LEN_INPUT 10

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);
    for(int i = 0; i < strlen(s1); i++){
        if(s1[i] >= 'a' && s1[i] <= 'z')
            printf("%c", s1[i]-32);
        else
            printf("%c", s1[i]+32);
    }
    return 0;
}
