#include <stdio.h>
int square(int x) {
    return x*x;
}

int main() {
    int num;
    scanf("%d", &num);
    printf("result = %d", square(num));
}