/*
준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다.
준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.

첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.

첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String [] args){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        String name = s.next(); // 사용자로부터 문자열 입력받기(공백, 탭, 줄 바꿈 전까지)
        
        System.out.println(name+"??!"); // 결과 출력하기
        
        s.close(); // 스캐너 s 닫기
    }
}
