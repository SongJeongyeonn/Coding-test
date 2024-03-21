#include<stdio.h>
int main()
{
    int x,y,z,p;
    scanf("%d %d %d", &x, &y, &z);
    if(x == y && y == z)
        p = 10000+x*1000;
    else if(x != y && y != z && z != x)
    {
        p = x>y?z>x?z:x:y>z?y:z;
        p *= 100;
    }
    else
    {
        p = x==y?x:y==z?y:z;
        p = 1000+p*100;
    }
    printf("%d", p);
    return 0;
}