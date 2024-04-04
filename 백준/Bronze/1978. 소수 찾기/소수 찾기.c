#include<stdio.h>
int main()
{
    int a, A, cnt, sum = 0;
    scanf("%d", &a);
    for (int i = 1; i <= a; i++)
    {
        cnt = 0;
        scanf("%d", &A);
        for (int j = 1; j <= A; j++)
        {
            if (A % j == 0)
                cnt++;
        }
        if (cnt == 2)
            sum++;
    }
    printf("%d", sum);
    return 0;
}