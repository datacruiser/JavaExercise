package rumenpian.chapterthree.thirdtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, m;
        n = in.nextInt();
        m = in.nextInt();

//        System.out.println(n + " " + m);

        int amount = 0;


        for (int i = n; i <= m; i++ )
        {
            amount = amount + NthPrime(i);
        }

        System.out.println(amount);
    }


    public static int NthPrime(int n)
        {
        int i = 2, j = 1;
        while (true)
        {
            j = j + 1;
            //找到一个素数后，将素数个数递减，j也归1
            if (j > i / j)
            {
                n--;
                //如果n个素数全部找到了以后跳出循环
                if (n == 0)
                    break;
                j = 1;
            }
            //找到一个素数将j归1，并将当前素数加1
            if (i % j == 0) {
                i++;
                j = 1;
            }
        }
        return i;
    }
}
