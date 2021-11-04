/*
대한고등학교에 재학 중인 민국이와 만세는 4과목(정보, 수학, 과학, 영어)에 대한 시험을 봤다. 
민국이와 만세가 본 4과목의 점수를 입력하면, 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램을 작성하시오. 
단, 서로 동점일 때는 민국이의 총점 S를 출력한다.

입력은 2줄로 이루어져 있다.
1번째 줄에는 순서대로 민국이의 정보, 수학, 과학, 영어 점수(정수형)가 있으며, 공백으로 구분되어 있다.
2번째 줄에는 1번째 줄과 마찬가지로 순서대로 만세의 정보, 수학, 과학, 영어 점수(정수형)가 있고, 공백으로 구분되어 있다.

문제에서 요구하는 정답을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner one = new Scanner(System.in); // 스캐너 one 생성
        int s[], t[], S=0, T=0; // 배열 선언, 변수 선언 및 초기화
        s=new int [4]; // 배열 구체적으로 만들기
        t=new int [4]; // 배열 구체적으로 만들기
        
        for(int i=0;i<4;i++){ // i가 0부터 4가 되기 전까지 1씩 증가하며 반복
            s[i]=one.nextInt(); // 사용자로부터 정수 입력받기
            S+=s[i];
        }
        
        for(int i=0;i<4;i++){
            t[i]=one.nextInt();
            T+=t[i];
        }
        
        if(S>=T){
            System.out.println(S);
        }
        else{
            System.out.println(T);
        }
        
        one.close();
    }
}
