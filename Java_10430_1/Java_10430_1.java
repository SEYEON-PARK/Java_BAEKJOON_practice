/*
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        
        int A = s.nextInt(); // 사용자로부터 정수 입력받기
        int B = s.nextInt(); // 사용자로부터 정수 입력받기
        int C = s.nextInt(); // 사용자로부터 정수 입력받기
        
        System.out.println((A+B)%C); // (A+B)%C의 값 출력하기
        System.out.println(((A%C) + (B%C))%C); // ((A%C) + (B%C))%C의 값 출력하기
        System.out.println((A*B)%C); // (A*B)%C의 값 출력하기
        System.out.println(((A%C) * (B%C))%C); // ((A%C) * (B%C))%C의 값 출력하기
    }
}
