#include <stdio.h>
int *maxmin(int arr[], int n) {
    static int m[2];
    m[0] = arr[0];
    m[1] = arr[0];
    for (int i = 1; i < n; i++) {
        if(m[0] > arr[i])
            m[0] = arr[i];
        if(m[1] < arr[i])
            m[1] = arr[i];
    }
    return m;
}
int main() {
    int num[10], n, *p;
    printf("value = ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("%d = ", i+1);
        scanf("%d", &num[i]);
    }
    p = maxmin(num, n);
    printf("max = %d\nmin = %d", *(p+1), *p);
}