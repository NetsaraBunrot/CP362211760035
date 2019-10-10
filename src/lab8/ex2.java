package lab8;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num[] = new int[5];

        //input data to array
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter an integer[" + (i + 1) + "]:");
            num[i] = scanner.nextInt();
        }//for
        //show data in array
        System.out.print("Data in array");
        for (int i : num) {
            System.out.print(i + " ");

        }

        //find maximum
        int min = num[0];
        for (int i : num) {
            if (min > i)
                min = i;
        }
        System.out.println("The mimimum number:" +min);

        //find minimum

        int total = 0 ;
        for (int i:num) {
            total += i;
        }
        System.out.print("The average number:"+(total/num.length));
    }
}