/*
A number that is the sum of its own digits each raised
to the power of the number of digits.

For example:
- 9 is an Armstrong number, because `9 = 9^1 = 9`
- 10 is not an Armstrong number, because `10 != 1^2 + 0^2 = 1`
- 153 is an Armstrong number, because `153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153`
- 154 is not an Armstrong number, because `154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190`

Compile and run the executable:
1. `gcc armstrong_numbers.c -o armstrong -lm`
2. `./armstrong`
*/

#include <stdio.h>
#include <math.h>

int get_int_length(int value) {
    int length = 0;

    while (value != 0) {
        value /= 10;
        ++length;
    }

    return length;
}

int main(void) {
    int numbers[4] = {9, 10, 153, 154};
    int array_length = sizeof(numbers) / sizeof(numbers[0]);

    for (int i = 0; i < array_length; i++) {
        int value = numbers[i];
        float total = 0;

        while (value > 0) {
            int digit = value % 10;
            total += pow(digit, get_int_length(numbers[i]));
            value /= 10;
        }

        if (numbers[i] == total) {
            printf("%i == %.0lf\n", numbers[i], total);
        } else {
            printf("%i != %.0lf\n", numbers[i], total);
        }
    }

    return 0;
}
