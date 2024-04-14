#include<stdio.h>
int main()
{
    int num[10];
    int res = 0;
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &num[i]);
        num[i] = num[i] % 42;
    }
    for (int j = 0; j < 10; j++)
    {
        int count = 0;
        for (int k = j+1; k < 10; k++)
        {
            if (num[j] == num[k])
                count += 1;
        }
        if (count == 0)
            res += 1;
    }
    printf("%d", res);
    return 0;
}