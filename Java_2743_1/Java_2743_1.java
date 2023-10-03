/*
알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner scan = new Scanner(System.in); // 스캐너 scan 생성
        String s = new String(); // String 객체 s 생성
        s = scan.next(); // 사용자로부터 문자열 입력받기
        System.out.println(s.length()); // 문자열의 길이 출력하기
    }
}
