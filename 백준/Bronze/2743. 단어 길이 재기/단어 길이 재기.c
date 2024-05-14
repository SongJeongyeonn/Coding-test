#include<stdio.h>
int main() {
    char m[100];
    scanf("%s", &m);
    int i, cnt = 0;
    for (i = 0; m[i] != '\0'; i++) {
        cnt++;
    }
    printf("%d",cnt);
    return 0;
}