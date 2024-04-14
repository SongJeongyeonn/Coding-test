#include<stdio.h>
char li[5][15];
int main()
{
    for (int i = 0; i < 5; i++)
        scanf("%s", &li[i]);
    for (int j = 0; j < 15; j++)
    {
        for (int i = 0; i < 5; i++)
        {
            if (li[i][j] != '\0')
                printf("%c", li[i][j]);
        }
    }
    return 0;
}