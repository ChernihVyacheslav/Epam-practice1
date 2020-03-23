package ua.nure.chernykh.practice1;

public class Part5 {

    private static final int TEN = 10;

    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(sumOfDigits(Integer.parseInt(args[0])));
        }
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while(number > 0) {
            sum += number % TEN;
            number /= TEN;
        }
        return sum;
    }
}
