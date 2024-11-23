/*
두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

첫째 줄에 A×B를 출력한다.
*/

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        System.out.println(a*b);
        
        s.close();
    }
}
