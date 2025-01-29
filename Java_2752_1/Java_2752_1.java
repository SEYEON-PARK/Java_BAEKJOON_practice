/*
동규는 세수를 하다가 정렬이 하고 싶어졌다.
정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.
정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.

정수 세 개가 주어진다. 이 수는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 수는 모두 다르다.

제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
*/

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if((a < b) && (b < c))
            System.out.println(a+" "+b+" "+c);
        else if((a < c) && (c < b))
            System.out.println(a+" "+c+" "+b);
        else if((b < a) && (a < c))
            System.out.println(b+" "+a+" "+c);
        else if((b < c) && (c < a))
            System.out.println(b+" "+c+" "+a);
        else if((c < a) && (a < b))
            System.out.println(c+" "+a+" "+b);
        else
            System.out.println(c+" "+b+" "+a);
        
        s.close();
    }
}
