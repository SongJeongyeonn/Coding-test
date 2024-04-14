#include<stdio.h>
int main()
{
    int a;
    scanf("%d", &a);
    for(int i = 2; i <= a; i++)
        if(a%i==0)
        {
            a = a/i + a%i;
            printf("%d\n", i);
            i -= 1;
            if(a < 2)
                return 0;
        }
}