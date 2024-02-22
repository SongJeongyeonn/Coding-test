#include<stdio.h>
int main()
{
    int A;
    scanf("%d", &A);
    printf("int a;\nint *ptr = &a;\n");
    if (A > 1)
    {
        for (int i = 1; i < A; i++)
        {
            printf("int ");
            for (int j = 0; j <= i; j++)
            {
                printf("*");
            }
    if (i == 1)
    {
        printf("ptr%d = &ptr;\n", i + 1);
    }
    else if (i >= 2)
    {
        printf("ptr%d = &ptr%d;\n", i + 1, i);
    }
        }
    }
    else
    {

    }
    return 0;
}