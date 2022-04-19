import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        mortgage(); //mortgage method
        //FizzBuzz(); //FizzBuzz method
        /*
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Hello World " + i);

        }*/


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
        double P;
        float r;
        int n;
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.print("Principal ($1K- $1M): ");
            P = scanner.nextDouble(); //Principal
            if (P >= 1000 && P <= 1000000) {

                break;
            }
            System.out.println("please enter a value between $1K - $1M ");
            continue;

        }
        while(true) {
            System.out.print("Annual Interest Rate: ");
            float AIR = scanner.nextFloat(); //Annual interest rate
            if (AIR >= 1 && AIR <= 100) {
                r = (AIR / percent) / Months; //monthly interest rate
                break;
            }

            System.out.println("please enter a value between 1 - 100 ");
            continue;


        }
        while(true){
            System.out.print("period (Years) ");
            int Years = scanner.nextInt();
            if (Years >= 1 && Years <= 30){
                n = Years * Months; //Monthly payments
                break;
            }

            System.out.println("please enter a value between 1 - 30 ");
            continue;
        }
        double M = P
                * (r*Math.pow(1+r,n))
                / (Math.pow(1+r,n)-1);
        String result = NumberFormat.getCurrencyInstance().format(M);
        System.out.println("Mortgage: " + result);
    }
    public static void FizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();
        boolean Fizz = num % 5 == 0;
        boolean Buzz = num % 3 == 0;
        if (Fizz && !Buzz) //if divisible by 5
            System.out.println("Fizz");
        else if (!Fizz && Buzz) //divisible by 3
            System.out.println("Buzz");
        else if (Fizz && Buzz)// both
            System.out.println("FizzBuzz");
        else// neither
            System.out.println(num);
    }
}
