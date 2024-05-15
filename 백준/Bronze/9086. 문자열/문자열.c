#include<stdio.h>
int main(){
    int n, i, j;
    scanf("%d", &n);
    char m[1000];
    for(i = 0; i < n; i++){
        scanf("%s", m);
        for(j = 0; m[j] != '\0'; j++){
        }
        printf("%c%c\n", m[0], m[j-1]);
    }
    return 0;
}