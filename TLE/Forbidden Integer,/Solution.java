
import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

         while(t-- > 0){

        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        

        List<Integer> ans = new ArrayList<>();

        if(x == 1 && k == 1){

            System.out.println("NO");
        }

        else if(x == 1 && k == 2 && n%2==1){

            System.out.println("NO");
        }

        else if(x!=1){ // n could be anything

            System.out.println("YES");
            int sum = 0;

            while(sum != n){

                sum += 1;

                ans.add(1);

            }

        }

        else if(n%2==0 && x!=2){ // n is even 

            System.out.println("YES");
            int sum = 0;

            while(sum != n){

                sum += 2;

                ans.add(2);

            }

        }

        else{ // n is odd or prime 

            System.out.println("YES");
            int sum = 3;

            ans.add(3);

            while(sum != n){

                sum += 2;

                ans.add(2);

            }

        }

        if(!ans.isEmpty()){

            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++){

                System.out.print(ans.get(i) + " ");

            }

            System.out.println();

        }

    }

 
    }

}
