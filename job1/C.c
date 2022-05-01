#include <stdio.h>
int main()
{
    int num, run = 1;
    printf("Input : ");
    scanf("%d", &num);
    if (num < 1)
    {
        printf("No Answer");
    }
    else
    {
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= num; j++)
            {
                if (j <= i)
                {
                    printf("   %d", 2*run-1);
                    run++;
                }
            }
            printf("\n");
        }
    }
}