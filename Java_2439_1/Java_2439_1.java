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
        
        for(int i=0;i<N;i++){ // int i가 0부터 N보다 작을 때까지 1씩 증가하며 반복
            for(int k=N-count;k>0;k--){ // k가 N-count부터 0보다 클 때까지 1씩 감소하며 반복
                System.out.print(" "); // 공백 출력하기
            }
            for(int j=0;j<count;j++){ // int j가 0부터 count보다 작을 때까지 1씩 증가하며 반복
                System.out.print("*"); // 별 출력하기
            }
            System.out.println(); // 한 줄 띄기
            count++; // count에 1 더하기
        }
        
        s.close(); // 스캐너 s 종료하기
    }
}
