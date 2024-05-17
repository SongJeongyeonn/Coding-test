#include<stdio.h>
int main() {
    char a[101];
    scanf("%s", &a);
    int i, j, res;
    for (i = 97; i <= 122; i++) {
        res = -1;
        for (j = 0; a[j] != '\0'; j++) 
            if (a[j] == i) {
                res = j;
                break;
            }
        printf("%d ", res);
    }
    return 0;
}