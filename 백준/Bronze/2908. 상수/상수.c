#include<stdio.h>
int main()
{
    int a[2] = { 0 };
    int n, res = 0;
    for (int i = 0; i < 2; i++)
    {
        scanf("%d", &n);
        while (n > 0) {
            a[i] = a[i] * 10 + n % 10;
            n = (n - n % 10) / 10;
        }
    }
    if (a[1] > a[0])
        res = a[1];
    else
        res = a[0];
    printf("%d", res);
    return 0;
}