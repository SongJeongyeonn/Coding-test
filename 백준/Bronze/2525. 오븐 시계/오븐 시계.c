#include<stdio.h>
int main()
{
    int H, M, C;
    scanf("%d %d %d", &H, &M, &C);
    if(C >= 60)
    {
        H += C/60;
        M += C%60;
        C = C - 60*(C/60);
    }
    else
        M += C;
    if(M >= 60)
    {
        H += M/60;
        M = M - 60*(M/60);
    }
    if(H > 23)
        H -= 24*(H/24);
    
    printf("%d %d", H, M);
    return 0;
}