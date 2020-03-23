package ua.nure.chernykh.practice1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Part 1: ");
        Part1.main(new String[]{});
        System.out.println("Part 2: ");
        String[] part2args = {"1", "2", "3", "4", "5"};
        Part2.main(part2args);
        System.out.println("Part 3: ");
        String[] part3args = {"A", "B", "C"};
        Part3.main(part3args);
        System.out.println("Part 4: ");
        String[] part4args = {"35", "21"};
        Part4.main(part4args);
        System.out.println("Part 5: ");
        String[] part5args = {"12345"};
        Part5.main(part5args);
        System.out.println("Part 6: ");
        String[] part6args = {"10"};
        Part6.main(part6args);
        System.out.println("Part 7: ");
        Part7.main(new String[]{});
    }
}
