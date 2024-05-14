#include<stdio.h>
int main() {
    char m[1001];
    int n;
    scanf("%s", &m);
    scanf("%d", &n);
    printf("%c", m[n - 1]);
    return 0;
}