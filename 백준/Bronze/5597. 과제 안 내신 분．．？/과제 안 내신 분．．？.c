#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
    int num[31] = {0};
    int A;
    for (int i = 1; i <= 28; i++)
    {
        scanf("%d", &A);
        num[A] = A;
    }
    for (int j = 1; j <= 30; j++)
    {
        if (num[j] == 0)
            printf("%d\n", j);
    }
    return 0;
}