/*
X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int student[] = new int[31]; // 정수형 배열 student 생성
        for(int i=0;i<28;i++){ // i에 0부터 28이 되기 전까지 1씩 증가시킨 값을 대입하며 반복
            int a = s.nextInt(); // 사용자로부터 정수 입력받기
            student[a] = 1; // student[a]에 1 대입하기
        }
        for(int i=1;i<31;i++){ // i에 1부터 31이 되기 전까지 1씩 증가시킨 값을 대입하며 반복
            if(student[i] != 1) // 만약, student[i]가 1과 다르다면(사용자가 입력한 값이 아니라면)
                System.out.println(i); // 출력하기
        }
        
        s.close(); // 스캐너 s 닫기
    }
}
