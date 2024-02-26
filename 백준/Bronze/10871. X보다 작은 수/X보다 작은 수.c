#include<stdio.h>
int main()
{
    int N,X;
    scanf("%d %d", &N, &X);
    int num[10000];
    for(int i = 0; i < N; i++)
    {
        scanf("%d", &num[i]);
        if(num[i] < X)
        {
            printf("%d ", num[i]);
        }
        else
        {
            
        }
    }
    return 0;
}