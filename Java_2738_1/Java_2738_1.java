/*
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String arg[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int a = s.nextInt(); // 사용자로부터 정수 입력받기
        int b = s.nextInt(); // 사용자로부터 정수 입력받기
        
        int A[][] = new int[a][b]; // 2차원 배열 A 생성(a * b 크기)
        int B[][] = new int[a][b]; // 2차원 배열 B 생성(a * b 크기)
        
        for(int i=0;i<a;i++){ // 0부터 a보다 작을 때까지 1씩 증가시킨 값을 i에 대입하며 반복
            for(int j=0;j<b;j++){ // 0부터 b보다 작을 때까지 1씩 증가시킨 값을 j에 대입하며 반복
                A[i][j] = s.nextInt(); // 사용자로부터 정수 입력받아 A[i][j]에 대입하기
            }
        }
        
        for(int i=0;i<a;i++){ // 0부터 a보다 작을 때까지 1씩 증가시킨 값을 i에 대입하며 반복
            for(int j=0;j<b;j++){ // 0부터 b보다 작을 때까지 1씩 증가시킨 값을 j에 대입하며 반복
                B[i][j] = s.nextInt(); // 사용자로부터 정수 입력받아 B[i][j]에 대입하기
            }
        }
        
        for(int i=0;i<a;i++){ // 0부터 a보다 작을 때까지 1씩 증가시킨 값을 i에 대입하며 반복
            for(int j=0;j<b;j++){ // 0부터 b보다 작을 때까지 1씩 증가시킨 값을 j에 대입하며 반복
                System.out.print(A[i][j]+B[i][j]+" "); // 결과 출력하기
            }
            System.out.println(); // 한 행마다 한 줄 띄어주기
        }
        
        s.close(); // 스캐너 s 닫기
    }
}
