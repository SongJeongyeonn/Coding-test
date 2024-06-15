#include<stdio.h>
int main() {
    int x, y, w, h, res = 0;
    scanf("%d %d %d %d", &x, &y, &w, &h);
    res = x>y ? y < w-x ? y < h-y ? y : h-y : w-x < h-y ? w-x : h-y : x < w-x ? x < h-y ? x : h-y :w-x < h-y ? w-x : h-y;
    printf("%d", res);
}