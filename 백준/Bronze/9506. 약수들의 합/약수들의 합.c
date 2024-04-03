#include<stdio.h>
int main()
{
    int a, sum;
    for (;;)
    {
        sum = 0;
        scanf("%d", &a);
        if (a == -1)
            return 0;
        for (int j = 1; j < a; j++)
        {
            if (a % j == 0)
                sum += j;
        }
        if (sum != a)
            printf("%d is NOT perfect.\n", a);
        else
        {
            printf("%d = 1", a);
            for (int j = 2; j < a; j++)
            {
                if (a % j == 0)
                    printf(" + %d", j);
            }
            printf("\n");
        }
    }
}