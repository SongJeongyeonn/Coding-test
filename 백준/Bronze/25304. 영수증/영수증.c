#include <stdio.h>
int main()
{
    int A, B;
    scanf("%d %d", &A, &B);
    int sum = 0;
    for (int i = 1; i <= B; i++)
    {
        int a, b;
        scanf("%d %d", &a, &b);
        sum = sum + a*b;
    }
    if (sum == A)
    {
        printf("Yes");
    }
    else
    {
        printf("No");
    }
    return 0;
}