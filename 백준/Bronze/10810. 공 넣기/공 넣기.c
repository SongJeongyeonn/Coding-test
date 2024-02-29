#include<stdio.h>
int main()
{
    int A, B, C, D, E;
    scanf("%d %d", &A, &B);
    int num[101] = {0};
    for(int i = 1; i <= B; i++)
    {
        scanf("%d %d %d", &C, &D, &E);
        while(C <= D)
        {
            num[C] = E;
            C++;
        }
    }
    for(int j = 1; j <= A; j++)
    {
        printf("%d ", num[j]);
    }
    return 0;
}