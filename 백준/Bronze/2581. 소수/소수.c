#include<stdio.h>
int main()
{
    int a, b, sum = 0, cnt, sma, i;
    scanf("%d %d", &a, &b);
    for (i = a; i <= b; i++)
    {
        cnt = 0;
        for (int j = 1; j <= i; j++)
            if (i % j == 0)
                ++cnt;
        if (cnt == 2)
            sum += i;
    }
    if (sum == 0)
        printf("-1");
    else
    {
        for (i = a; i <= b; i++)
        {
            cnt = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    ++cnt;
            if (cnt == 2)
            {
                sma = i;
                break;
            }
        }
        printf("%d\n%d", sum, sma);
    }
    return 0;
}