package lab5;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class lab5_3 {

            public static void main (String[] args) {
                Scanner scanner = new Scanner(System.in);
                int day;
                long hr,minute,seconds;
                System.out.print("Entre sexcond:");
                long input_second= scanner.nextInt();

                day = (int) TimeUnit.SECONDS.toMinutes(input_second);
                hr = TimeUnit.SECONDS.toMinutes(input_second *24);
                minute = TimeUnit.SECONDS.toMinutes(input_second)-
                        TimeUnit.SECONDS.toMinutes(input_second*60);
                seconds = TimeUnit.SECONDS.toMinutes(input_second)-
                        TimeUnit.SECONDS.toMinutes(input_second*60);

                System.out.print("circle round");
                System.out.print("circle round");
                System.out.print("circlr round");

    }
}