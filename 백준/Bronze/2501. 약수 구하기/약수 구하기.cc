#include<stdio.h>
    int main()
    {
        int a, b, cnt = 0;
        scanf("%d %d", &a, &b);
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
            {
                cnt++;
                if (cnt == b)
                    printf("%d", i);
            }
        }
        if (cnt < b)
            printf("0");
        return 0;
    }