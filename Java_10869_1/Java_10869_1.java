/*
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
*/

import java.util.*;

class Main{
    public static void main(String args []){
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int A = s.nextInt(); // 사용자로부터 정수 입력받기
        int B = s.nextInt(); // 사용자로부터 정수 입력받기
        
        System.out.println(A+B); // 결과(덧셈) 출력하기
        System.out.println(A-B); // 결과(뺄셈) 출력하기
        System.out.println(A*B); // 결과(곱셈) 출력하기
        System.out.println(A/B); // 결과(나눗셈) 출력하기
        System.out.println(A%B); // 결과(나머지 연산) 출력하기
        
        s.close(); // 스캐너 s 닫기
    }
}
