/*
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s=new Scanner(System.in); // 스캐너 s 생성
        int N=s.nextInt(); // 사용자로부터 정수 입력받기
        
        for(int i=1;i<=N;i++){
            System.out.println(i);
        }
        
        s.close();
    }
}
