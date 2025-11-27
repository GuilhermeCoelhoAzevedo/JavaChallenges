package leetCode;

public class ReturnFactorialNumber {
    public static int nFactorial(int factor) {
        int result = Math.max(1, factor);

        for (var i = factor - 1; i > 1; i--){
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 10;
        int result = ReturnFactorialNumber.nFactorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
