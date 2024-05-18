#include<stdio.h>
int main()
{
    char a[20];
    int n, t;
    scanf("%d", &t);
    for (int i = 1; i <= t; i++) {
        scanf("%d %s", &n, &a);
        for (int j = 0; j < a[j] != '\0'; j++)
            for (int k = 0; k < n; k++)
                printf("%c", a[j]);
        printf("\n");
    }
    return 0;
}