/*
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성하기
        int N = s.nextInt(); // 사용자로부터 정수 입력받기
        int count=1; // 변수 count 정의 및 초기화 
        
        for(int i=0;i<N;i++){
            for(int k=N-count;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
        
        s.close();
    }
}
