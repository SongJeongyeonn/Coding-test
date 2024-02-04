#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
    int A;
    scanf("%d", &A);
    for(int i=0; i<=A; i++)
    {
        for(int j=A; j>A-i; j--)
        {
            printf(" ");
        }
        for(int l=1; l<=A-i; l++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}