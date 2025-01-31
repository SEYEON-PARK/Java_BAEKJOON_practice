/*
동규는 세수를 하다가 정렬이 하고 싶어졌다.
정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.
정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.

정수 세 개가 주어진다. 이 수는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 수는 모두 다르다.

제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성

        int a = s.nextInt(); // 사용자로부터 정수 입력받기
        int b = s.nextInt(); // 사용자로부터 정수 입력받기
        int c = s.nextInt(); // 사용자로부터 정수 입력받기

        if((a < b) && (b < c)) // 만약, a < b < c 라면
            System.out.println(a+" "+b+" "+c); // 결과 출력하기
        else if((a < c) && (c < b)) // 위의 경우가 아니고, a < c < b 라면
            System.out.println(a+" "+c+" "+b); // 결과 출력하기
        else if((b < a) && (a < c)) // 위의 경우가 아니고, b < a < c 라면
            System.out.println(b+" "+a+" "+c); // 결과 출력하기
        else if((b < c) && (c < a)) // 위의 경우가 아니고, b < c < a 라면
            System.out.println(b+" "+c+" "+a); // 결과 출력하기
        else if((c < a) && (a < b)) // 위의 경우가 아니고, c < a < b 라면
            System.out.println(c+" "+a+" "+b); // 결과 출력하기
        else // 위의 경우들이 아니라면(c < b < a 라면)
            System.out.println(c+" "+b+" "+a); // 결과 출력하기
        
        s.close();
    }
}
