#include <stdio.h>
int main()
{
    int A, B;
    scanf("%d %d", &A, &B);
    if (A <= 23 && B >= 45)
    {
        B = B - 45;
        printf("%d %d", A, B);
    }
    else if (A <= 23 && A > 0 && B < 45)
    {
        A = A - 1;
        B = B - 45;
        B = 60 + B;
        printf("%d %d", A, B);
    }
    else
    {
        A = 23;
        B = B - 45;
        B = 60 + B;
        printf("%d %d", A, B);
    }
    return 0;
}