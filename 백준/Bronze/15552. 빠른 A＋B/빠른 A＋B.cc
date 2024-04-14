#include<stdio.h>
int main()
{
    int a, A, B;
    scanf("%d", &a);
    for(int i = 1; i <= a; i++)
    {
        scanf("%d %d", &A, &B);
        printf("%d\n", A+B);
    }
    return 0;
}