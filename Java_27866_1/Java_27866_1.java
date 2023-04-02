/*
단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.

첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.
둘째 줄에 정수 i가 주어진다. (1 <= i <= 절댓값 S)

S의 i번째 글자를 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        
        String st = s.next(); // 사용자로부터 문자열 입력받기
        int n = s.nextInt(); // 사용자로부터 정수 입력받기
        
        System.out.println(st.charAt(n-1));
        
        s.close();
    }
}
