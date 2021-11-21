/*
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

첫째 줄에 다음 세 가지 중 하나를 출력한다.
   -A가 B보다 큰 경우에는 '>'를 출력한다.
   -A가 B보다 작은 경우에는 '<'를 출력한다.
   -A와 B가 같은 경우에는 '=='를 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner one = new Scanner(System.in); // 스캐너 one 생성하기
        int A, B; // 변수 생성
        A=one.nextInt(); // 사용자로부터 정수 입력받기
        B=one.nextInt(); // 사용자로부터 정수 입력받기
        
        if(A>B){ // 만약, A가 B보다 크다면
            System.out.println(">"); // ">" 출력하기
        }
        else if(A<B){ // 만약, A가 B보다 크지 않고 A가 B보다 작다면
            System.out.println("<"); // "<" 출력하기
        }
        else{ // A가 B보다 크지 않고 A가 B보다 작지도 않다면
            System.out.println("=="); // "==" 출력하기
        }
        
        one.close(); // 스캐너 one 닫기
    }
}
