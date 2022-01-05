/*
*/

import java.util.Scanner;

class Main{
    public static void main(String args[]){
       Scanner a=new Scanner(System.in);
       int N=a.nextInt();
       int sum=0;
        
       for (int i=N;i>0;i--){
           sum+=i;
       }
        
       System.out.println(sum);
        
       a.close();
    }
}
