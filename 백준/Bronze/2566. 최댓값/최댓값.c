#include<stdio.h>
int main()
{
    int  arr[9][9];
    int big = -1, l, h;
    for(int i = 0; i < 9; i++)
        for(int j = 0; j < 9; j++)
        {
            scanf("%d", &arr[i][j]);
            if(arr[i][j] > big)
            {
                big = arr[i][j];
                l = i+1;
                h = j+1;
            }
        }
    printf("%d\n%d %d",big, l, h);
    return 0;
}