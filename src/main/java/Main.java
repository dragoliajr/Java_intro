import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        mortgage();

        //bunch of activity from the video
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age2 = scanner.nextByte();
        System.out.println("You are " + age2);

        String result2 = NumberFormat.getPercentInstance().format(.21);
        String message = "hello world";
        int age = 26;
        int[] numbers = {2,3,5,6,7,8};
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 5;
        int result =  (int) Math.round(Math.random()*100);

        System.out.println(result);
        System.out.println(result2);
        Date now = new Date();
        //now.getTime();
        System.out.println(now);

        */

    }
    public static void mortgage(){ //Mortgage method
        final byte Months = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double P = scanner.nextDouble(); //Principal
        System.out.print("Annual Interest Rate: ");
        float AIR = scanner.nextFloat(); //Annual interest rate
        System.out.print("period (Years) ");
        int Years = scanner.nextInt();
        float r = (AIR/percent)/Months; //monthly interest rate
        int n = Years * Months; //Monthly payments

        double M = P
                * (r*Math.pow(1+r,n))
                / (Math.pow(1+r,n)-1);
        String result = NumberFormat.getCurrencyInstance().format(M);
        System.out.println("Mortgage: " + result);



    }
}
