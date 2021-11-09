package numbers;

public class PerfectNumbers {
    boolean isPerfectNumber(int number) {
        int sumOfDividers = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        if (sumOfDividers == number) {
            return true;
        } else {
            return false;
        }
    }
}
