/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

1부터 n까지 합을 출력한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
       Scanner a=new Scanner(System.in); // 새로운 스캐너 a 생성
       int N=a.nextInt(); // 사용자로부터 정수 입력받기
       int sum=0; // 정수 선언 및 초기화
        
       for (int i=N;i>0;i--){ // i가 N부터 0보다 클 때까지 1씩 감소하며 반복 
           sum+=i; // sum에 sum+i 대입하기
       }
        
       System.out.println(sum); // 결과 출력하기
        
       a.close(); // 스캐너 a 닫기
    }
}
