#include<stdio.h>
int main(){
    int n, money, level, a,b;
    scanf("%d", &n);
    scanf("%d %d", &money, &level);
    for(int i = 1; i <= n; i++){
        scanf("%d %d", &a, &b);
        if(a <= money && b > level){
            printf("YES");
            break;
        }
        else if (i == n)
            printf("NO");
    }
    return 0;
}