package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Enter value for n1");
        int n2 = ap.nextInt("Enter value for n2");

        double average = (n1+n2)/2;
        System.out.println(average);
    }

}
