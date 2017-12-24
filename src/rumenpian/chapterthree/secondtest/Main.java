package rumenpian.chapterthree.secondtest;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int number;
        int count = 1;
        int amount = 0;
        int temp = input;

        while (input / 10 != 0)
        {

            //int i = input % 10;
            input = input / 10;
            count++;

//            System.out.println(count);


        }

        for(int i = 1; i <= count; i++ )

        {
            number = temp % 10;


            if ((isEven(number) && isEven(i)) || (!isEven(number) && !isEven(i)))
            {
                amount = amount + (int) Math.pow(2, i-1);
            }





            temp = temp / 10;
        }



        System.out.println(amount);

    }

    private static boolean isEven(int n)
    {
        return (n % 2 == 0);
    }



}
