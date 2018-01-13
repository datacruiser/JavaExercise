package jinjiepian.chapterone.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";
        List<String> str_list = new ArrayList<String>();

        while (!str.equals("END"))
        {
            str = in.nextLine();
            str_list.add(str);


        }

        for (int i = str_list.size()-1; i>=0; i--)
        {
            int locStrart = 0;
            int locEnd = 0;
            int checkSum = 0;
            String subString;
            String checkHex;
            if (str_list.get(i).startsWith("$GPRMC"))



            {

                locStrart = str_list.get(i).indexOf("$");
                locEnd = str_list.get(i).indexOf("*");
//                System.out.println(locStrart);
//                System.out.println(locEnd);
                subString = str_list.get(i).substring(locStrart+1, locEnd);
//                System.out.println(subString);
                checkSum = calculateXOR(subString);
//                System.out.println(checkSum);
                checkHex = str_list.get(i).substring(locEnd+1);
//                System.out.println(checkHex);
                String[] arrays = str_list.get(i).split(",");
//                for (String s : arrays)
//                {
////
//                            System.out.println(s);
//                }

                if (arrays[2].equals("A") && Integer.toHexString(checkSum).equals(checkHex))
                {
                    showTime(addSplit(arrays[1]));
                    break;
                }


//                String subString = str_list.get(i).substring(str_list.get(i).indexOf("$")+1, str_list.get(i).indexOf("*"));
//                if (Integer.toHexString(calculateXOR(subString)).equals(str_list.get(i).substring(str_list.get(i).indexOf("*")+1)))
//                {
////                    String[] arrays = str_list.get(i).split(",");
//                    if (arrays[2].equals("A"))
//                    {
//
////                        System.out.println(addSplit(arrays[1]));
//
//
//                    }
//
////                    else {
////
////                        System.out.println(arrays[2]);
////
////
//                System.out.println(subString);
//                System.out.println(str_list.get(i).substring(str_list.get(i).indexOf("*")+1));
//                System.out.println(Integer.toHexString(calculateXOR(subString)));

            }

//            for (String s : str_arrays)
//            {
//                if (s.equals("$GPRMC"))
//                {
//
//                }
//            }
//            System.out.println(str_list.get(i));
//            System.out.println(su);
        }



    }

    public static int calculateXOR(String str)
    {
        int result = (int)(str.charAt(0));
        for (int i = 1; i<str.length(); i++)
        {
            result = result^(int)(str.charAt(i));
        }

        return result % 655536;
    }

    public static String addSplit(String str)
    {
        return str.substring(0,6);
    }

    public static void showTime(String time)
    {
        int intTime = Integer.parseInt(time);
        int second=intTime%100;
        int minute=(intTime/100)%100;
        int hour=intTime/10000+8;
        if(hour>=24)
            hour=hour-24;

        if (hour < 10)
        {
            System.out.print("0"  );
        }
        System.out.print(hour + ":") ;
        if (minute < 10)
        {
            System.out.print("0"  );
        }
        System.out.print(minute + ":") ;
        if (second < 10)
        {
            System.out.print("0");
        }
        System.out.println( second );
//        System.out.printf("%02d:%02d:%02d",hour, minute, second);

    }



//    public static string()
}
