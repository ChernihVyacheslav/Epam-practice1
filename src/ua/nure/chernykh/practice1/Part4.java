package ua.nure.chernykh.practice1;

public class Part4 {

    public static void main(String[] args) {
        if(args.length > 1) {
            int arg1 = 0;
            int arg2 = 0;
            final int argNumber = 2;
            for (int i = 0; i < argNumber; i++) {
                if (i == 0) {
                    arg1 = Integer.parseInt(args[i]);
                } else {
                    arg2 = Integer.parseInt(args[i]);
                }
            }
            System.out.println(gcd(arg1, arg2));
        }
    }

    static int gcd(int arg1, int arg2) {
        int result = 0;
        if(arg1 != 0 && arg2 != 0) {
            if (arg1 >= arg2) {
                if (arg1 % arg2 == 0) {
                    result = arg2;
                } else {
                    result = gcd((arg1 % arg2), arg2);
                }
            } else {
                result = gcd(arg2, arg1);
            }
        }
        return  result;
    }

}
