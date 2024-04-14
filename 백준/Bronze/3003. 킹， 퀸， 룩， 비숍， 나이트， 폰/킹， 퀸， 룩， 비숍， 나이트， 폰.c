#include<stdio.h>
int main()
{
    int a,r = 0,c = 0;
    for(int i = 1; i <= 6; i++)
    {
        scanf("%d", &a);
        if(i==1 || i==2)
            r = (a-1)*-1;
        else if(i==3 || i==4 || i==5)
            r = (a-2)*-1;
        else
            r = (a-8)*-1;
        printf("%d ",r);
    }
    return 0;
}