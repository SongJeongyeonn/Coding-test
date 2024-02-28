#include <stdio.h>
int main()
{
    int num[9];
    int big = 1;
    int numb = 0;
    for(int i = 1; i <= 9; i++)
    {
        scanf("%d", &num[i]);
        if(big < num[i])
        {
            big = num[i];
            numb = i;
        }
        else
        {
            
        }
    }
    printf("%d\n%d", big, numb);
    return 0;
}