#include<stdio.h>
int main() {
    int n, m, i, c, d, res;
    scanf("%d %d", &n, &m);
    int hap[n+1];
    long long haps[n+1];
    haps[0] = 0;
    for (i = 1; i <= n; i++) {
        scanf("%d", &hap[i]);
        haps[i] = haps[i - 1] + hap[i];
    }
    for (i = 1; i <= m; i++) {
        scanf("%d %d", &c, &d);
        res = haps[d] - haps[c - 1];
        printf("%d\n", res);
    }
    return 0;
}