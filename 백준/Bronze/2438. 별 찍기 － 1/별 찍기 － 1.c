#include<stdio.h>
int main()
{
    int A, i, j;
    scanf("%d", &A);
    for (i = 1; i <= A; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}