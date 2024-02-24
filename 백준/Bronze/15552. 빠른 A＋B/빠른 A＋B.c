#include <stdio.h>
int main()
{
    int A;
    scanf("%d", &A);
    for (int i = 1; i <= A; i++)
    {
        int B, C;
        scanf("%d %d", &B, &C);
        printf("%d\n", B + C);
    }
    return 0;
}