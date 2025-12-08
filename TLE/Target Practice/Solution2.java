import java.util.Scanner;

 

public class Solution2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){

            int tp = 0;

            for(int i = 0;i < 10; i++){

                String line = sc.next();

                for(int j = 0; j < 10; j++){

                    if(line.charAt(j) == 'X'){

                        tp += getScore(i, j);

                    }

                }

            }

            System.out.println(tp);

        }

        sc.close();

    }

    public static int getScore(int i, int j){

        if(i == 0 || j == 0 || i == 9 || j == 9){

            return 1;

        }

        else if(i == 1 || j == 1 || i == 8 || j == 8){

            return 2;

        }

        else if(i == 2 || j == 2 || i == 7 || j == 7){

            return 3;

        }

        else if(i == 3 || j == 3 || i == 6 || j == 6){

            return 4;

        }﻿

        return 5;

    }

}

