#include <stdio.h>
int main()
{
    int num;
    printf(" *** Com Pro 57 *** \nEnter a number : ");
    scanf("%d", &num);
    printf("Result         : ");
    if (num%5 == 0)
    {
        printf("Com");
    }
    if (num%7 == 0)
    {
        printf("Pro");
    }
    if (num%7 != 0 && num%5 != 0)
    {
        printf("%d", num);
    }
}