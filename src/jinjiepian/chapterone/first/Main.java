package jinjiepian.chapterone.first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;

        String line = in.nextLine();

        String[] arrays = line.split(" +");

        for (String s : arrays)
        {
            i++;
            if(i == arrays.length)
            {
                System.out.print(s.length()-1);

            }

            else
                System.out.print(s.length() + " ");
        }

    }
}
