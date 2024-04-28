#include<stdio.h>
int main()
{
    int n, i;
    long long fac = 1;
    scanf("%d", &n);
    if(n == 0){ }
    else 
        for(i = n; i > 0; i--){
        fac *= i;
    }
    printf("%lld", fac);
    return 0;
}