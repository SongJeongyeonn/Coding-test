#include<stdio.h>
#include<string.h>
int main()
{
    int cnt = 0, i = 0;
    char a[1000000];
    gets(a);
    if (a[0] != ' ' && a[strlen(a)-1] != ' ')
        cnt++;
    else if (a[0] == ' ' && a[strlen(a)-1] == ' ')
        i = 1;
    for (; i < strlen(a); i++) {
        if (a[i] == ' ')
            cnt++;
    }
    printf("%d", cnt);
    return 0;
}