/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

각 테스트 케이스마다 A+B를 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 매소드
        Scanner scan = new Scanner(System.in); // 새로운 스캐너 scan 생성
        int T = scan.nextInt(); // 사용자로부터 정수 입력받기
        
        for(int i=0;i<T;i++){ // i가 0부터 T가 되기 전까지 1씩 증가시키며 반복
            int A = scan.nextInt(); //
            int B = scan.nextInt();
            
            System.out.println(A+B);
        }
        
        scan.close();
    }
}
