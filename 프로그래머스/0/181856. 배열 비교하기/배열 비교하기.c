#include <stdio.h>

int solution(int arr1[], size_t arr1_len, int arr2[], size_t arr2_len) {
    int sum1 = 0, sum2 = 0, answer, i;
    for(i = 0; i< arr1_len; i++){
        sum1 += arr1[i];
    }
    for(i = 0; i < arr2_len; i++){
        sum2 += arr2[i];
    }
    answer = arr1_len > arr2_len ? 1 : arr1_len < arr2_len ? -1 : sum1 > sum2 ? 1 : sum2 > sum1 ? -1 : 0;
    return answer;
}