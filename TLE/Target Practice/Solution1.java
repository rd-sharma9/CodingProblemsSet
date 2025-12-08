import java.util.Scanner;
 
public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            char[][] arrows = new char[10][10];
            int points = 0;
            for (int i = 0; i <10; i++) {
                     String str = sc.next();

                    char arr[] = str.toCharArray();

                    arrows[i] = arr;
                }


            for (int i = 0; i <10; i++) {
                for (int j = 0; j <10; j++) {
                    if(arrows[i][j] == 'X'){
                         
                        if(((i == 0 || i == 9) && (j>=0 && j<=9)) || ((j == 0 || j == 9) && (i>=0 && j<=9))){
                            points +=1;
                        }

                        else if( ((i == 1 || i == 8) && (j>=1 && j<=8)) || ((j == 1 || j == 8) && (i>=1 && i<=8))){
                            points += 2;
                        }
                        
                        else if( ((i == 2 || i == 7) && (j>=2 && j<=7)) || ((j == 2 || j == 7) && (i>=2 && i<=7))){
                            points += 3;
                        }

                        else if( ((i == 3 || i == 6) && (j>=3 && j<=6)) || ((j == 3 || j == 6) && (i>=3 && i<=6))){
                            points += 4;
                        }

                        else {
                            points += 5;
                        }
                    }
                }

             }

            System.out.println(points);

            }

              

             

            sc.close();
        }




         
    }

 


