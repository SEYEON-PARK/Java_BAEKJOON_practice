/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int N=s.nextInt(); // 사용자로부터 정수 입력받기
        int n[];
        n = new int [1000000]; // 배열 선언
        
        for(int i=0;i<N;i++){ // i가 0부터 N보다 작을 때까지 1씩 증가하며 반복
            n[i]=s.nextInt(); // 사용자로부터 정수를 입력받아 n[i]에 대입하기
        }
        
        int max=n[0], min=n[0]; // max에 n[0]의 값 대입하고, min에 n[0]의 값 대입하기
        
        for(int i=0;i<N;i++){ // i가 0부터 N보다 작을 때까지 1씩 증가하며 반복
            if(n[i]>max){ // 만약, n[i]의 값이 max의 값보다 크다면
                max=n[i]; // max에 n[i]의 값 대입하기
            }
        }
        
        for(int i=0;i<N;i++){ // i가 0부터 N보다 작을 때까지 1씩 증가하며 반복 
            if(n[i]<min){ // 만약, n[i]의 값이 min의 값보다 작다면
                min=n[i]; // min에 n[i]의 값 대입하기
            }
        }
        
        System.out.print(min+" "+max); // 결과 출력하기
        
        s.close(); // 스캐너 s 닫기
    }
}
