/*
상근이의 남자 친구의 수와 여자 친구의 수가 주어졌을 때, 친구는 총 몇 명인지 구하는 프로그램을 작성하시오.

입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 두 정수 M과 F로 이루어져 있으며, 각각은 상근이의 남자 친구의 수와 여자 친구의 수이다. (1 ≤ M, F ≤ 5)
입력의 마지막 줄에는 0이 두 개 주어진다.

각 테스트 케이스마다 상근이의 친구의 수를 출력한다.
*/

import java.util.Scanner; // Scanner를 사용하기 위해서

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        int M, F; // 변수 선언
        Scanner sc = new Scanner(System.in); // 스캐너 sc 생성
        while(true){ // 무한 반복
            M=sc.nextInt(); // 사용자로부터 정수 입력받기
            F=sc.nextInt(); // 
            if(M==0 && F==0){ // 만약, M이 0이고 F도 0이라면
                break; // 가장 가까운 반복문(while문) 빠져 나가기
            }
            System.out.println(M+F); // 결과 출력하기
        }
        
        sc.close(); // 스캐너 sc 종료하기
    }

}
