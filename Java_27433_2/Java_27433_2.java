/*
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.

첫째 줄에 N!을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String argv[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int N = s.nextInt(); // 사용자로부터 정수 입력받기
        System.out.println(fac(N)); // 결과(fac(N)의 리턴값) 출력하기
    }
    
    public static long fac(int n){
        if(n<=1)
            return 1;
        else
            return n * fac(n-1);
    }
}
