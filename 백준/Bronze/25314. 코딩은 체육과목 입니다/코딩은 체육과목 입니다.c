#include <stdio.h>
int main()
{
    int A;
    scanf("%d", &A);
    for(int i = 1; i <= A/4; i++)
    {
        printf("long ");
    }
    printf("int");
    return 0;
}