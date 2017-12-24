package rumenpian.chapterthree.fourthtest;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int temp = input;

        int count = 0;
        int flag = 0;

        if(input < 0)
        {
            System.out.print("fu ");
            input = - input;
            temp = -temp;
        }

        while (input / 10 != 0)
        {

            //int i = input % 10;
            input = input  / 10;
            count++;


        }

        //System.out.println(count);


        for (int i = count; i >= 0; i--)
        {
            flag = temp / (int) pow(10, i);



            switch (flag){
                case 1:
                    System.out.print("yi");
                    break;
                case 2:
                    System.out.print("er");
                    break;
                case 3:
                    System.out.print("san");
                    break;
                case 4:
                    System.out.print("si");
                    break;
                case 5:
                    System.out.print("wu");
                    break;
                case 6:
                    System.out.print("liu");
                    break;
                case 7:
                    System.out.print("qi");
                    break;
                case 8:
                    System.out.print("ba");
                    break;

                case 9:
                    System.out.print("jiu");
                    break;
                case 0:
                    System.out.print("ling");
                    break;
            }





           if(temp / 10 > 0 || i > 0)
           {
               System.out.print(" ");
           }

//           if(i == 0){
//                System.out.println();
//           }



           temp = temp % (int) pow(10, i);



        }


    }
}
