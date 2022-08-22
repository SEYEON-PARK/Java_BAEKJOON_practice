/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int max, min;
        int n[];
        n = new int [1000000];
        
        for(int i=0;i<N;i++)
            n[i]=s.nextInt();
        
        max=n[0]; min=n[0];
        
        for(int i=0;i<N;i++)
            if(n[i]>max)
                max=n[i];

        for(int i=0;i<N;i++)
            if(n[i]<min)
                min=n[i];
        
        System.out.print(min+" "+max);
        
        s.close();
    }
}
