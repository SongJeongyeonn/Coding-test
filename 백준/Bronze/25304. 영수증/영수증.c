#include<stdio.h>
int main()
{
    int n, p, m, q, s=0;
    scanf("%d %d", &n, &p);
    for(int i = 0; i < p; i++)
    {
        scanf("%d %d", &m, &q);
        s += q*m;
    }
    if(s == n)
            printf("Yes");
    else
            printf("No");
    return 0;
}