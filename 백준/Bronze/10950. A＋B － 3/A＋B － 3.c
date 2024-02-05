#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
    int A, B, C, D;
    scanf("%d", &A);

    for (int i = 1; i <= A; i++)
    {
        scanf("%d %d", &B, &C);
        D = B + C;
        printf("%d\n", D);

    }
    return 0;
}