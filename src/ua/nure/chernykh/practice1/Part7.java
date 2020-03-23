package ua.nure.chernykh.practice1;

public class Part7 {
    private static char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final int TWENTY_SIX = 26;

    public static void main(String[] args) {
        String[] stringNumbers = {"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};

        for (int i = 0; i < stringNumbers.length; i++) {
            int numericNumber = str2int(stringNumbers[i]);
            System.out.println(stringNumbers[i] + " ==> " + numericNumber + " ==> " + int2str(numericNumber));
        }
    }

    public static int str2int(String number) {
        int resultNumber = 0;
        for (int i = 0; i < number.length(); i++) {
            char singleLetter = number.charAt(number.length() - 1 - i);
            resultNumber += letter2int(singleLetter) * Math.pow(TWENTY_SIX, i);
        }
        return resultNumber;
    }

    static int letter2int(char letter) {
        letter = Character.toUpperCase(letter);
        for (int i = 0; i < letters.length; i++) {
            if (letter == letters[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public static String int2str(int number) {
        StringBuilder resultNumber = new StringBuilder();
        while (number > 0) {
            int singleDigit = number % TWENTY_SIX;
            if (singleDigit != 0) {
                resultNumber.append(letters[singleDigit - 1]);
            } else {
                resultNumber.append(letters[TWENTY_SIX - 1]);
            }
            number = (number - 1) / TWENTY_SIX;
        }
        return resultNumber.reverse().toString();
    }

    public static String rightColumn(String number) {
        System.out.print("For number " + number + " the next one is: ");
        return int2str(str2int(number) + 1);
    }
}
