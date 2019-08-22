package lab5;

import javax.xml.stream.events.EntityReference;
import java.util.Scanner;

public class lab5_3 {
    public  static  void  main (String in) {
        Scanner sc = new Scanner(System.in);
        int day;
        long input_second = sc.nextLong();
        day = (int) (input_second / (60*60*24));
        System.out.println("Day: "+day);

        hr = (input_second - (day + 60*60*24))/(60*60);
        System.out.println("Hour: "+hr);

        minute = (input_second - (hr * 60*60)- (day *60*60*24));


    }
}