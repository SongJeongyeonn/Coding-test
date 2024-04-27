#include<stdio.h>
int main()
{
    long fac;
    int n, i = 0;
    scanf("%d", &n);
    i = n, fac = 1;
    if(n == 0)
    {
        
    }   
    else{
     while(i > 0)
    {
        fac *= i;
         --i;
    }
    }
    printf("%ld", fac);
    return 0;
}