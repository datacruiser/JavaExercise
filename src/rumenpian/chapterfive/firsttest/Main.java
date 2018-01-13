package rumenpian.chapterfive.firsttest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("abc\t123");
//        System.out.println("acd\t1345");

        Scanner in = new Scanner(System.in);
//        int factor = 2;
        int n = in.nextInt();

        if (isPrime(n))
        {
            System.out.println(n+"="+n);
        }

        else
        {
            System.out.print(n+"=");

            for (int i = 2; n != 1; i++)
                {
                    if (n % i ==0)
                    {
                        System.out.print(i);
                        System.out.print("x");
                        n = n / i;
                        i--;
                    }

                    if(isPrime(n)){
                        System.out.print(n);
                        break;
                }



            }
        }


    }


    /**
     * <pre>
     * 用于判断一个数是否为素数，若为素数，返回true,否则返回false
     * </pre>
     *
     * @param a
     *            输入的值
     * @return true、false
     */
    public static boolean isPrime(int a) {

        boolean flag = true;

        if (a < 2) {// 素数不小于2
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {// 若能被整除，则说明不是素数，返回false

                    flag = false;
                    break;// 跳出循环
                }
            }
        }
        return flag;
    }

}
