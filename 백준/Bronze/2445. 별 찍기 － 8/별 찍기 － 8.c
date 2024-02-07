#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
    int A;
    scanf("%d", &A);
    for (int i = 1; i <= A; i++)
    {
        for (int j = (A - i); j < A; j++)
        {
            printf("*");
        }
        for (int l = i; l < A; l++)
        {
            printf(" ");
        }
        for (int f = i; f < A; f++)
        {
            printf(" ");
        }
        for (int k = (A - i); k < A; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    for (int i = 1; i <= A; i++)
    {
        for (int j = i; j < A; j++)
        {
            printf("*");
        }
        for (int l = (A - i); l < A; l++)
        {
            printf(" ");
        }
        for (int f = (A - i); f < A; f++)
        {
            printf(" ");
        }
        for (int k = i; k < A; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}