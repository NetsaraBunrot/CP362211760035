package lab6;

import java.util.Scanner;

public class lab6_3 {
    public  static void main (String[] args){
        {
            //BMI = weight/(hight*hight)
            Scanner in = new Scanner(System.in);

            System.out.println("weight: ");
            Float weingt = in.nextFloat();

            System.out.println("hight: ");
            Float hight = in.nextFloat();

            float bmi = weingt/(hight*hight);
            System.out.println((bmi));
        }
    }
}
