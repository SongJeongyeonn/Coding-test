#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
    int A, B;
    scanf("%d", &A);
    for (int i = 1; i <= 9; i++)
    {
        B = A * i;
        printf("%d * %d = %d\n", A, i, B);
    }
    return 0;
}