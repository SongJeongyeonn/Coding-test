#include<stdio.h>
int main()
{
    int x, big = 0;
    float res;
    scanf("%d", &x);
    int a[1000];
    for(int i = 0; i < x; i++)
    {
        scanf("%d", &a[i]);
        big = big < a[i] ? a[i] : big;
    }
    for(int i = 0; i < x; i++)
        res += (float)a[i]/big*100;
    printf("%f\n", res/x);
    return 0;
}