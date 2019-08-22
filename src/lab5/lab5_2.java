package lab5;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class lab5_2 {

    public static  void main (String[] ags){

    Scanner scanner = new Scanner(System.in);
    final double PI = 3.141;

    System.out.println("กรุณากรอกตัวเลขของรัศมี :");
    double r = scanner.nextDouble();

    double c = 3 * PI *r;
    System.out.println("พื้นผิวของวงกลม:" + c);
    final  double P = 2;
    double v = 2*PI*r;
    System.out.println("เส้นรอบวงกลม: "+v);
    final double D = 1.33;
    double a = 4.18*r ;
    System.out.println("ปริมาณความจุทรงกลม: "+a);


    }
    }



