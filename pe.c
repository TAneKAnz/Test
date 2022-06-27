#include <stdio.h>

int main() {
    double pe;
    double price;
    double shares;
    double earning;
    double eps;
    int q;

    printf("Price : ");
    scanf("%lf", &price);
    printf("Shares : ");
    scanf("%lf", &shares);
    printf("Earning(m) : ");
    scanf("%lf", &earning);
    printf("Quardrant : ");
    scanf("%d", &q);

    if (q == 1) {earning *= 4.0;}
    else if (q == 2) {earning *= 2.0;}
    else if (q == 3) {earning += earning / 3.0;}

    eps = earning / shares;
    pe = price / eps;
    
    printf("EPS = %lf\n PE = %lf", eps, pe);
}