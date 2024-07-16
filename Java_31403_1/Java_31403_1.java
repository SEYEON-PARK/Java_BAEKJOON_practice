/*
JavaScript에서 +, -은 수에 대해서는 일반적인 의미의 덧셈 뺄셈의 의미를 가지고 있습니다. 하지만 문자열에 대해서 +는 두 문자열을 이어붙이라는 의미이고, -는 양쪽 문자열을 수로 해석한 이후에 빼라는 의미입니다.
A, B, C를 각각 수와 문자열로 생각했을 때 A+B-C를 출력하세요.

첫 줄에는 정수 A가 주어집니다. (1 <= A <= 1,000)
둘째 줄에는 정수 B가 주어집니다. (1 <= B <= 1,000)
셋째 줄에는 정수 C가 주어집니다. (1 <= C <= 1,000)
주어지는 모든 수는 0으로 시작하지 않는 양의 정수입니다.

첫 줄에는 A, B, C를 수로 생각했을 때, A+B-C를 출력하세요.
둘째 줄에는 A, B, C를 문자열로 생각했을 때, A+B-C를 출력하세요.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int A, B, C; // 변수 선언 
        A = s.nextInt(); // 사용자로부터 정수 입력받기
        B = s.nextInt(); // 사용자로부터 정수 입력받기
        C = s.nextInt(); // 사용자로부터 정수 입력받기
        
        System.out.println(A+B-C); // 정수로 봤을 때 결과 출력하기
        
        if (B < 10) // 만약, B가 10보다 작다면
            System.out.println(A*10+B-C); // 문자열로 생각했을 때 결과 출력하기
        else if (B < 100) // 만약, 10 <= B <100이라면
            System.out.println(A*100+B-C); // 문자열로 생각했을 때 결과 출력하기
        else if (B < 1000) // 만약, 100 <= B <1000이라면
            System.out.println(A*1000+B-C); // 문자열로 생각했을 때 결과 출력하기
        else // 만약, 1000 <= B이라면
            System.out.println(A*10000+B-C); // 문자열로 생각했을 때 결과 출력하기
        
        s.close(); // 스캐너 s 닫기
    }
}
