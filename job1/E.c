#include <stdio.h>
int main()
{
    int num;
    printf("Enter your number : ");
    scanf("%d", &num);
    printf("%d! = ", num);
    for (int i = num-1; i > 0; i--) {
        num *= i;
    }
    printf("%d", num);
}