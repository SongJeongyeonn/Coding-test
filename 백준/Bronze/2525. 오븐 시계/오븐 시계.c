#include <stdio.h>
int main()
{
    int A, B, C;
    scanf("%d %d %d", &A, &B, &C);
    if (A <= 23 && B+C < 60)
    {
        B = B+C;
    }
    else if (A < 23 && B+C >= 60)
    {
        B = B+C;
        do
        {
            A = A+1;
            B = B-60;
            if (A == 23 && B >= 60)
            {
                A = -1;
                do
                {
                    A = A + 1;
                    B = B - 60;
                } while (B >= 60);
            }
        } while (B >= 60 );
    }
    else
    {
        A = -1;
        B = B+C;
        do
        {
            A = A+1;
            B = B-60;
        } while (B >= 60);
    }
    printf("%d %d", A, B);
    return 0;
}