package rumenpian.chaptertwo_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        int a = input/10;
        int b = input%10;

        switch( b ){
            case 1:
                System.out.print("Faint signals, barely perceptible, ");
                break;
            case 2:
                System.out.print("Very weak signals, ");
                break;
            case 3:
                System.out.print("Weak signals, ");
                break;
            case 4:
                System.out.print("Fair signals, ");
                break;
            case 5:
                System.out.print("Fairly good signals, ");
                break;
            case 6:
                System.out.print("Good signals, ");
                break;
            case 7:
                System.out.print("Moderately strong signals, ");
                break;
            case 8:
                System.out.print("Strong signals, ");
                break;
            case 9:
                System.out.print("Extremely strong signals, ");
                break;

        }

        switch ( a ) {
            case 1:
                System.out.println("unreadable.");
                break;
            case 2:
                System.out.println("barely readable, occasional words distinguishable.");
                break;
            case 3:
                System.out.println("readable with considerable difficulty.");
                break;
            case 4:
                System.out.println("readable with practically no difficulty.");
                break;
            case 5:
                System.out.println("perfectly readable.");
                break;

        }

//        Unreadable
//        Barely readable, occasional words distinguishable
//
//
//        Perfectly readable
//
//
//
//
//
//
//
//
//
//
//
//        String R = " ";
//        String
//
//        System.out.println(input);
//        System.out.println((a)+ (b));
    }


}
