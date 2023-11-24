/*
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

시험 성적을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String arg[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int score = s.nextInt(); // 사용자로부터 정수 입력받기
        
        if(score>=90) // 만약, score가 90보다 크거나 같다면
            System.out.println("A"); // "A" 출력하기
        else if(score>=80)
            System.out.println("B");
        else if(score>=70)
            System.out.println("C");
        else if(score>=60)
            System.out.println("D");
        else
            System.out.println("F");
        
    }
}
