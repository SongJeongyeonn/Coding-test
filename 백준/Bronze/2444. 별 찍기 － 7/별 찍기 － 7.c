#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
    int A;
    scanf("%d", &A);
    for (int i = 1; i <= A; i++)
    {
        for (int j = i; j < A; j++)
        {
            printf(" ");
        }
        for (int l = A; l > (A - i); l--)
        {
            printf("*");
        }
        for (int k = (A - 1); k > (A - i); k--)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int i = 1; i < A; i++)
    {
        for (int j = A; j > (A - i); j--)
        {
            printf(" ");
        }
        for (int l = i; l < A; l++)
        {
            printf("*");
        }
        for (int k = i; k <(A - 1); k++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}