package rumenpian.chapterthree.firsttest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int input = 0;
        do {
            input = in.nextInt();
            if(input%2 == 1)
            {
               odd++;
            }
            else
            {
                even++;
            }
        } while (input != -1);
        even--;

        System.out.println(odd + " " + even);
    }
}
