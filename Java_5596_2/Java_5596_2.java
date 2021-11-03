/*
*/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner one = new Scanner(System.in);
        int s[], t[], S=0, T=0;
        s=new int [4];
        t=new int [4];
        
        for(int i=0;i<4;i++){
            s[i]=one.nextInt();
            S+=s[i];
        }
        
        for(int i=0;i<4;i++){
            t[i]=one.nextInt();
            T+=t[i];
        }
        
        if(S>=T){
            System.out.println(S);
        }
        else{
            System.out.println(T);
        }
        
        one.close();
    }
}
