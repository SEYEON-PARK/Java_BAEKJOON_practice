/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int A, B, T; // 변수 선언
        T=s.nextInt(); // 사용자로부터 정수(테스트 케이스의 개수) 입력받기
    
        for(int i=0;i<T;i++) // i가 0부터 T보다 작을 때까지 1씩 증가하며 반복(총 T번 반복)
        {
            A=s.nextInt(); // 사용자로부터 정수 입력받기
            B=s.nextInt(); // 사용자로부터 정수 입력받기
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, A, B, A+B); // 형식에 맞춰 결과 출력하기
        }
    }
}
