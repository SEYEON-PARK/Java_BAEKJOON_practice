/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
*/

import java.util.*; // 스캐너를 사용하기 위해서

class Main{ // Main 클래스
    public static void main(String srg[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int N=s.nextInt(); // 사용자로부터 정수(테스트 케이스의 개수) 입력받기
        
        for(int i=1;i<=N;i++){ // i가 1부터 N보다 작거나 같을 때까지 1씩 증가하며 반복
            int a, b; // 변수 선언
            a=s.nextInt(); // 사용자로부터 정수 입력받기
            b=s.nextInt(); // 사용자로부터 정수 입력받기
            
            System.out.println("Case #"+(i)+": "+(a+b)); // 결과 출력하기
        }
        
        s.close(); // 스캐너 s 닫기
    }
}
