/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

1부터 n까지 합을 출력한다.
*/

import java.util.Scanner; // Scanner를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
       Scanner a=new Scanner(System.in); // 스캐너 a 생성
       int N=a.nextInt(); // 사용자로부터 정수 입력받기
       int sum=0; // 변수 선언 및 초기화
        
       for (int i=0;i<N;i++){ // i가 0부터 N보다 작을 때까지 1씩 증가하며 반복
           sum+=i+1; // sum에 sum+i+1 대입하기
       }
        
       System.out.println(sum); // 결과 출력하기
        
       a.close(); // 스캐너 a 닫기
    }
}
