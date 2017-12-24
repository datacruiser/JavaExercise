package rumenpian.chaterfour.firsttest;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int a ;//幂
        int b ;//系数
        int max = 0;//用来获取最高幂
        boolean isFirst = true;//判断是否是首次输出
        int[] num1= new int[100];//定义数组
        int[] num2= new int[100];//定义数组
        //读取第一个数组
        do {
            a = in.nextInt();
            b = in.nextInt();
            num1[a] = b;
            if(max<=a) {
                max=a;
            }
        } while(a!=0);
        //读取第二个数组
        do {
            a = in.nextInt();
            b = in.nextInt();
            num2[a] = b;
            if(max<=a) {
                max=a;
            }
        } while(a!=0);

        int sum ;//等幂系数求和

        for(  int i=max;i>=0;i--){
            sum =num1[i]+num2[i];
            if(max==0) {
                System.out.print(sum);
                break;//如果max=0  直接跳出，程序不往下走
            }
            if(sum!=0) {
                if(!isFirst) {
                    if(sum>=0) {
                        System.out.print("+");//不是首次输入且系数大于0时输出需要增加“+”
                    }
                }
                if(sum!=1||i ==0) {
                    System.out.print(sum);//幂为0，系数不为1 时输出系数
                }
                if(i!=0) {
                    System.out.print("x");//幂不等于0时 输出X
                }
                if(i!=0&&i!=1) {
                    System.out.print(i);//幂不等于0且不等于1时，输入幂
                }
                isFirst = false;
            }
            if(isFirst && i ==0&&sum==0){
                System.out.print(sum);//首次输出系数不需要在前面“+”
            }
        }
    }
}