/*
오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
MenOfPassion 알고리즘은 다음과 같다.
MenOfPassion(A[], n) {
    i = ⌊n / 2⌋;
    return A[i]; # 코드1
}

첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.

첫째 줄에 코드 1의 수행 횟수를 출력한다.
둘째 줄에 코드 1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int N = s.nextInt(); // 사용자로부터 정수 입력받기
        
        System.out.println("1"); // 결과(코드 1의 수행 횟수) 출력하기!
        System.out.println("0"); // 결과(코드 1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수) 출력하기!
        
        s.close(); // 스캐너 s 닫기
    }
}
