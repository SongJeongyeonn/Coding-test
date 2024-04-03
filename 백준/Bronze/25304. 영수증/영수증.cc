#include<stdio.h>
int main()
{
    int x, y, a, b, sum = 0;
    scanf("%d %d", &x, &y);
    for (int i = 1; i <= y; i++)
    {
        scanf("%d %d", &a, &b);
        sum += a * b;
    }
    if (sum == x)
        printf("Yes");
    else
        printf("No");
    return 0;
}