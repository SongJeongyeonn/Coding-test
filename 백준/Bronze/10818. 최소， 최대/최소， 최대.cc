#include <stdio.h>
int main()
{
    int N;
    scanf("%d", &N);
    int num[1000000];
    int sma = 1000000;
    int big = -1000000;
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &num[i]);

        if (num[i] < sma)
            sma = num[i];
        if (num[i] > big)
            big = num[i];
    }
    printf("%d %d", sma, big);
    return 0;
}