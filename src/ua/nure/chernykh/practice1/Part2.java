package ua.nure.chernykh.practice1;

public class Part2 {

    public static void main(String[] args) {
        int sum = 0;
        for(String s: args) {
            int arg = Integer.parseInt(s);
            sum += arg;
        }
        System.out.println(sum);
    }
}
