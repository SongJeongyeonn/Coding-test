#include <stdio.h>
int main() {
	int A;
	scanf("%d", &A);
	for (int k = 1; k <= A; k++) {
		for (int i = 1; i <= A-k; i++){
			printf(" ");
		}
		for (int j = 1; j <= k; j++) {
			printf("*");
		}
		printf("\n");
	}	
}