package rumenpian.chapterfive.secondtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        boolean flag = true;

        for (int i=n; i<=m; i++)
        {

            if (isPerfect(i))
            {
                if (flag)
                    flag = false;
                else
                    System.out.print(" ");

                System.out.print(i);
            }

        }

        if (flag)
            System.out.print("NIL");

//        System.out.println(n);
//        System.out.println(m);

//        System.out.println(isPerfect(m));
    }

    /**
     * <pre>
     * 用于判断一个数是否为完数，若为完数，返回true,否则返回false
     * </pre>
     *
     * @param a
     *            输入的值
     * @return true、false
     */
    public static boolean isPerfect(int a)
    {
        boolean flag = false;

//        final int SIZE = 1000;
        int sum = 0;



        for (int j = 1;j<a; j++)
        {
            if (a % j == 0)
            {
                sum = sum + j;
            }


        }

        if (sum == a)
        {
            flag = true;
        }



        return flag;
    }

}


