package ua.nure.chernykh.practice1;

import java.util.Arrays;

public class Part6 {



    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            int[] array = generatePrimeNumbers(n);
            System.out.print(array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(/*(i + 1) + ": " + */" " + array[i]);
            }
        }
    }

    static int[] generatePrimeNumbers(int n) {
        final int sieveLength = 100_000;
        int[] primeNumbers = new int[n];
        boolean[] eratosthenesSieve = new boolean[sieveLength];
        Arrays.fill(eratosthenesSieve, true);
        for (int i = 2; i < eratosthenesSieve.length; i++) {
            if (eratosthenesSieve[i]) {
                for (int j = i * i; j > 0 && j < eratosthenesSieve.length; j += i) {
                    eratosthenesSieve[j] = false;
                }
            }
        }
        int arrayCount = 0;
        for (int i = 2; arrayCount < n && i < eratosthenesSieve.length; i++) {
            if (eratosthenesSieve[i]) {
                primeNumbers[arrayCount] = i;
                arrayCount++;
            }
        }
        return primeNumbers;
    }
}
