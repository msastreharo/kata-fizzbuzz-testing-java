public class FizzBuzz {

    public static String assigning(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }

    public static String counter(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }
}