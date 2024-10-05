/*
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

A+B+C의 값을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        long sum = 0; // 결과를 저장할 변수 sum 선언 및 0으로 초기화
        
        for(int i=0;i<3;i++){ // i에 0부터 3보다 작을 때까지 1씩 증가시킨 값을 대입하며 반복
            sum += s.nextLong(); // sum에 sum + 사용자로부터 입력받은 정수의 값 대입하기
        }
        
        System.out.println(sum); // 결과 출력하기
        
        s.close(); // 스캐너 s 닫기
    }
}
