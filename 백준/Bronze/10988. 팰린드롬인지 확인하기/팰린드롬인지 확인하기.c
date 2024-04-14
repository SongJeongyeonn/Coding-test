#include<stdio.h>
int main()
{
    char t[101], n = 1;
    scanf("%s", t);
    for (int i = 0; i < strlen(t)/2; i++)
    {
        if (t[i] != t[strlen(t) - 1 - i])
        {
            n = 0;
            break;
        }
    }
    printf("%d", n);
    return 0;
}