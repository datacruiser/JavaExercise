package rumenpian.chaterfour.secondtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] board = new int[n][n];

        boolean gotResult = false;

        int numOfX = 0;
        int numOfO = 0;

        //读入矩阵

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                board[i][j] = in.nextInt();
            }
        }

        //检查行

        for (int i=0; i<n; i++)
        {
            numOfX = 0;
            numOfO = 0;

            for (int j=0; j<n; j++)
            {
                if (board[i][j] == 1)
                {
                    numOfX ++;
                }
                else
                {
                    numOfO ++;
                }
            }

            if (numOfX == n || numOfO == n)
            {
                gotResult = true;
                break;
            }
        }
        //检查列

        if (!gotResult)
        {
            for (int i = 0; i < n; i++)
            {
                numOfX = 0;
                numOfO = 0;

                for (int j = 0; j < n; j++)
                {
                    if (board[j][i] == 1)
                    {
                        numOfX ++;
                    }
                    else {
                        numOfO ++;
                    }
                }

                if (numOfX == n || numOfO == n)
                {
                    gotResult = true;
                    break;
                }
            }
        }

        if (!gotResult)
        {
            numOfO = 0;
            numOfX = 0;
            for (int i=0; i<n; i++)
            {
                if (board[i][i] == 1)
                {
                    numOfX ++;
                }
                else
                {
                    numOfO ++;
                }

            }

            if (numOfX == n || numOfO == n)
            {
                gotResult = true;
            }
        }

        if (!gotResult)
        {
            numOfO = 0;
            numOfX = 0;
            for (int i=0; i<n; i++)
            {
                if (board[i][n-i-1] == 1)
                {
                    numOfX ++;
                }
                else
                {
                    numOfO ++;
                }

            }

            if (numOfX == n || numOfO == n)
            {
                gotResult = true;
            }
        }


        if (gotResult)
        {
            if (numOfX == n)
            {
                System.out.println("X");
            }
            else if (numOfO == n)
            {
                System.out.println("O");
            }
        }

        else
        {
            System.out.println("NIL");
        }


    }
}
