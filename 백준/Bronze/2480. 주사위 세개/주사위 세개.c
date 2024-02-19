#include <stdio.h>
int main()
{
    int A, B, C, sum;
    scanf("%d %d %d", &A, &B, &C);
    if( A == B && B == C)
    {
        sum = A*1000;
        sum = sum+10000;
    }
    else if( A == B && B != C && C != A)
    {
        sum = A*100;
        sum = sum+1000;
    }
    else if( A != B && B == C && C != A)
    {
        sum = B*100;
        sum = sum+1000;
    }
    else if( A != B && B != C && C == A)
    {
        sum = C*100;
        sum = sum+1000;
    }
    else
    {
        if( A > B && A > C)
        {
            sum = A*100;
        }
        else if( B > A && B > C)
        {
            sum = B*100;
        }
        else if( C > B && C > A)
        {
            sum = C*100;
        }
    }
    printf("%d", sum);
    return 0;
}