/*
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.

첫째 줄에 N!을 출력한다.
*/

import java.util.*;

class Main{
    public static void main(String argv[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long result=1;
        
        for(int i=2;i<=N;i++){
            result*=i;
        }
        
        System.out.println(result);
    }
}
