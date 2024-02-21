#include <stdio.h>
int main()
{
    int A, B;
    int num[100];
    int count = 0;
    scanf("%d", &A);
    for (int i = 0; i < A; i++)
    {
        scanf("%d", &num[i]);
    }
    scanf("%d", &B);
    for (int j = 0; j < A; j++)
    {
        if (num[j] == B)
            count++;
    }
    printf("%d", count);
}