package lab7;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] arga) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which subjests you like the most? : ");
        System.out.println("1.System Aanlysis and Desing.");
        System.out.println("2. Computer Programming.");
        System.out.println("3.Internet Application Programming.");
        System.out.println("Select: ");
        int selector = scanner.nextInt();

        //switch-case
        switch (selector){
            case 1:System.out.println("This subject is vevy hard.");break;
            case 2:System.out.println("Yes,Computer Programming is vevy fum.");break;
            case 3:System.out.println("ohhh, you might expert in programming.");break;
            default: System.out.println("You have to enter 1-3.");
        }


    }

}
