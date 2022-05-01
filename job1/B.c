#include <stdio.h>
int main()
{
    int w, h;
    printf("Enter width height : ");
    scanf("%d %d", &w, &h);
    printf("Width : %d, Height : %d\n\n", w, h);
    printf("123456789.123456789.123456789.123456789.123456789\n");
    for (int i = 0; i < h; i++)
    {
        for (int j = 0; j < w; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}