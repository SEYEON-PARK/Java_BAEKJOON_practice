/*
돌 게임은 두 명이서 즐기는 재밌는 게임이다.
탁자 위에 돌 N개가 있다. 상근이와 창영이는 턴을 번갈아가면서 돌을 가져가며, 돌은 1개 또는 3개 가져갈 수 있다. 마지막 돌을 가져가는 사람이 게임을 지게 된다.
두 사람이 완벽하게 게임을 했을 때, 이기는 사람을 구하는 프로그램을 작성하시오. 게임은 상근이가 먼저 시작한다.

첫째 줄에 N이 주어진다. (1 ≤ N ≤ 1000)

상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner a = new Scanner(System.in); // 스캐너 a 생성
        int N = a.nextInt(); // 사용자로부터 정수 입력받기
        
        if(N%2==1){ // 만약, N%2의 값이 1과 같다면
            System.out.println("CY"); // "CY" 출력하기
        }
        else{ // N%2의 값이 1과 같지 않다면
            System.out.println("SK"); // "SK" 출력하기
        }
        
        a.close(); // 스캐너 a 닫기
    }
}
