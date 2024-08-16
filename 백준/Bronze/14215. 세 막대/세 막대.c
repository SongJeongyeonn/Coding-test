#include<stdio.h>
int main() {
	int len[6] = { 0 }, w;
	scanf("%d %d %d", &len[0], &len[1], &len[2]);
	len[0] > len[1] ? len[0] > len[2] ? (len[3] = len[0], len[4] = len[1], len[5] = len[2]) : (len[3] = len[2], len[4] = len[0], len[5] = len[1]) : len[1] > len[2] ? (len[3] = len[1], len[4] = len[0], len[5] = len[2]) : (len[3] = len[2], len[4] = len[1], len[5] = len[0]);
	len[3] < len[4] + len[5] ? (w = len[3] + len[4] + len[5]) : (w = len[4] + len[5] + len[4] + len[5] - 1);
	printf("%d", w);
	return 0;
}