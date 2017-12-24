package rumenpian.chaptertwo_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int UTC = 0;
        int BJT = 0;

        Scanner in = new Scanner(System.in);
        UTC = in.nextInt();
//        System.out.println(UTC);
        int UTC_3 = UTC/100;
//        System.out.println(UTC_3);

        if(UTC_3 >= 0 && UTC_3 < 8)
        {
            BJT = (UTC_3 + 24 - 8) * 100 + (UTC - UTC_3 * 100);
        }
        else if(UTC_3 >= 8)
        {
            BJT = (UTC_3 - 8) * 100 + (UTC - UTC_3 * 100);
        }
        System.out.println(BJT);
    }
}
