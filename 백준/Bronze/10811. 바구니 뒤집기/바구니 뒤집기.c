#include <stdio.h>

int main() {
	int N, M, first;
	int i, j;
	int a[100] = { 0 };

	scanf("%d %d", &N, &M);
	for (int k = 1; k <= N; k++){
		a[k] = k;
		}
	for (int k = 0; k < M; k++) {
		scanf("%d %d", &i, &j);
		for (int l = 0 ; l <(j-i+1)/2; l++) {
			first = a[i + l];
			a[i + l] = a[j - l];
			a[j - l] = first;
			}
		}
	for (int k = 1; k <= N; k++)
		printf("%d ", a[k]);
	return 0;
}
