#include<stdio.h>
int main() {
    int n, a, b;
    int x[2] = { -10000,10000 };
    int y[2] = { -10000,10000 };
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d %d", &a, &b);
        x[0] = x[0] > a ? x[0] : a;
        x[1] = x[1] < a ? x[1] : a;
        y[0] = y[0] > b ? y[0] : b;
        y[1] = y[1] < b ? y[1] : b;
    }
    if (n == 1)
        printf("0");
    else {
        x[0] = x[0] == x[1] ? x[0] + 1 : x[0];
        y[0] = y[0] == y[1] ? y[0] + 1 : y[0];
        printf("%d", (x[0] - x[1]) * (y[0] - y[1]));
    }
    return 0;
}