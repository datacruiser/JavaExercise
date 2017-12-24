package rumenpian.chapterone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        int Fahrenheit;
        double Celsius;
        Fahrenheit = in.nextInt();

        Celsius = (double)(Fahrenheit - 32) / (9/5.0);
        System.out.println((int)Celsius);


    }
}
