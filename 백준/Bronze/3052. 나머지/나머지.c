#include <stdio.h>

int main()
{

    int result = 0;
    int remain[10];

    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &remain[i]);
        remain[i] = remain[i] % 42;
    }

    for (int i = 0; i < 10; i++) 
    {
        int count = 0;
        for (int j = i + 1; j < 10; j++)
        { 
            if (remain[i] == remain[j])
                count++;
        }
        if (count == 0)
            result++;
    }

    printf("%d", result);
}