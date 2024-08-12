#include<stdio.h>
int main() {
    int n, a;
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        int m[4] = { 0 };
        scanf("%d", &a);
        while (a > 0) {
            if (a - 25 >= 0) {
                a -= 25;
                m[0]++;
            }
            else if (a - 10 >= 0) {
                a -= 10;
                m[1]++;
            }
            else if (a - 5 >= 0) {
                a -= 5;
                m[2]++;
            }
            else if (a - 1 >= 0) {
                a -= 1;
                m[3]++;
            }
        }
        printf("%d %d %d %d\n", m[0], m[1], m[2], m[3]);
    }
    return 0;
}