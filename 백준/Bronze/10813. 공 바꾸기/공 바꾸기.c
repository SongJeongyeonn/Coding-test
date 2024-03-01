#include <stdio.h>
int main()
{
    int A, B;
    scanf("%d %d", &A, &B);
    int num[100];
    for (int i = 1; i <= A; i++)
    {
        num[i] = i;
    }
    int C, D, ex1, ex2;
    for (int j = 1; j <= B; j++)
    {
        scanf("%d %d", &C, &D);
        ex1 = num[C], ex2 = num[D];
        num[C] = ex2;
        num[D] = ex1;

    }
    for (int k = 1; k <= A; k++)
    {
        printf("%d ", num[k]);
    }
    return 0;
}