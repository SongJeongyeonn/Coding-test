#include<stdio.h>
int main()
{
    int a;
    scanf("%d", &a);
    for(int i = a; i/4!=0; i=i-4)
        printf("long ");
    printf("int");
    return 0;
}