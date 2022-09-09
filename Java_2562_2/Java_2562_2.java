/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner one = new Scanner(System.in); // 스캐너 one 생성
        int n[];
        n = new int[9]; // 배열 선언
        int big_number=0; // 변수 선언 및 초기화
        
        for(int i=0;i<9;i++){ // i가 0부터 9가 되기 전까지 1씩 증가하며 반복
            n[i]=one.nextInt(); // 사용자로부터 정수를 입력받아 n[i]에 저장
        }
        
        int max=0; // 변수 선언 및 초기화(입력받았던 수가 자연수이기 때문에 max를 0으로 초기화해도 된다.)
        for(int i=0;i<9;i++){ // i가 0부터 9가 되기 전까지 1씩 증가하며 반복
            if(n[i]>max){ // 만약, n[i]의 값이 max의 값보다 크다면
                max=n[i]; // max에 n[i]의 값 대입하기
                big_number=i; // big_number에 i의 값 대입하기
            }
        }
        
        System.out.println(max);
        System.out.println(big_number+1); // 결과 출력하기
        
        one.close(); // 스캐너 one 닫기
    }
}
