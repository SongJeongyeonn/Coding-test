#include<stdio.h>
int main() {
    int n[5] = {0};
    scanf("%d %d %d %d %d", &n[0], &n[1], &n[2], &n[3], &n[4]);
    int res = (n[0]*n[0] + n[1]*n[1] + n[2]*n[2] + n[3]*n[3] + n[4]*n[4]) % 10;
    printf("%d", res);
}