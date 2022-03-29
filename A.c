#include <stdio.h>
int main() {
    int angle;
    printf("Enter number : ");
    scanf("%d", &angle);
    angle %= 360;
    if (angle % 180 == 0) {
        printf("X-axis");
    }
    else if (angle % 90 == 0) {
        printf("Y-axis");
    }
    else if ((angle < 90 && angle > 0)|| angle < -270) {
        printf("Quadrant 1");
    }
    else if ((angle < 180 && angle > 0) || angle < -180) {
        printf("Quadrant 2");
    }
    else if ((angle < 270 && angle > 0) || angle < -90) {
        printf("Quadrant 3");
    }
    else {
        printf("Quadrant 4");
    }
}