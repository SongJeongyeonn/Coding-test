#include<stdio.h>

int main()
{
	int A, i, j;
	scanf("%d", &A);
	for (i = A; i > 0; i--)
    {
		for (j = 0; j < i; j++)printf("*");
		printf("\n");
	}
	return 0;
}