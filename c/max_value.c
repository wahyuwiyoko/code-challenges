#include <stdio.h>

int main(void) {
    int numbers[10] = {1, 50, 6, 200, 3, 100, 30, 8, 99, 100};
    int max = numbers[0];

    for (int i = 1; i < 10; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }

    printf("Max value: %d\n", max);

    return 0;
}
