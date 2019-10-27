package lab10;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class ex2 {

    private static String Min;

    public static void main(String[] args) {

        int max = Max(10,20);
        System.out.println("The maximum numbre is:"+max);

        //min
       System.out.println("The maximum numbre is:"+Min(10,20));
       //Multiple
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter an integer 2: ");
        int num2 = sc.nextInt();

        int nul = Multiple(num1, num2);
        System.out.println("The multiple value is : " + mul);
    }

    public static int Multiple(int num1, int num2){
        return num1, num2

    }

    private static String Multiple() {
    }

    private static int Min(int x, int y) {
            int rs;
            if (x <y)
                rs = x;
            else
                rs = y;
            return rs;

        }

    private static int Max(int x, int y) {
        int rs;
        if (x >y)
            rs = x;
        else
            rs = y;
        return rs;
    }


    }



