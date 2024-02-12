#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
    unsigned int A;
    unsigned int sum = 0;

    scanf("%d", &A);

    unsigned int i = 0;
    do
    {
        sum = sum+i;
        i++;
    } while (i <= A);

    printf("%d\n", sum);

    return 0;
}