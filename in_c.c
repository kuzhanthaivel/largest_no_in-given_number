#include <stdio.h>

int main() {
    float num1, num2;

    printf("Enter the first number: ");
    scanf("%f", &num1);

    printf("Enter the second number: ");
    scanf("%f", &num2);

    if (num1 > num2) {
        printf("%.2f is the largest number\n", num1);
    }
    else if (num2 > num1) {
        printf("%.2f is the largest number\n", num2);
    }
    else {
        printf("Both numbers are equal\n");
    }

    return 0;
}
