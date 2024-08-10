#include<stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int num[3] = { 0, 1, 0 };
    if (n > 0)
        for (int i = 0; i < n; i++)
            i % 2 != 0 ? (num[0] += num[1], num[2] = num[0]) : (num[1] += num[0], num[2] = num[1]);
    else {
        num[2] = 0;
    }
    printf("%d", num[2]);
    return 0;
}