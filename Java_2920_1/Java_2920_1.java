/*
다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int num[] = new int[8]; // 배열 num 선언
        int status = 0; // 상황을 저장할 변수 status 선언 및 초기화
        
        for(int i=0;i<8;i++){ // i가 0부터 8이 되기 전까지 1씩 증가시키며 반복
            num[i]=s.nextInt(); // 사용자로부터 정수를 입력받아 num[i]에 저장
        }
        
        for(int i=0;i<8;i++){ // i가 0부터 8이 되기 전까지 1씩 증가시키며 반복
            if(num[i]==i+1){ // 만약, num[i]가 i+1과 같다면
                if(i==0) // 만약, i가 0이라면(첫 번째 숫자라면)
                    status = 1; // status에 1 대입하기(오름차순의 가능성이 있음을 표시)
                if(status != 1){ // 만약, status가 1이 아니라면(첫 시작이 오름차순으로 시작되지 않았고, 다른 숫자로 시작되었다는 의미) 
                    System.out.println("mixed"); // "mixed" 출력하기
                    break; // 반복문 빠져 나가기
                }
                if(i==7) // 만약, i가 7이라면(마지막 숫자라면)
                    System.out.println("ascending"); // "ascending" 출력하기
                continue; // 계속하기
            }
            else if(num[i]==8-i){ // 만약 num[i]가 i+1과 같지 않고, 8-i와 같다면
                if(i==0) // 만약, i가 0이라면(첫 번째 숫자라면)
                    status = 2; // status에 2 대입하기(내림차순의 가능성이 있음을 표시)
                if(status != 2){ // 만약, status가 2가 아니라면(첫 시작이 내림차순으로 시작되지 않았고, 다른 숫자로 시작되었다는 의미) 
                    System.out.println("mixed"); // "mixed" 출력하기
                    break; // 반복문 빠져 나가기
                }
                if(i==7) // 만약, i가 7이라면(마지막 숫자라면)
                    System.out.println("descending"); // "descending" 출력하기
                continue; // 계속하기
            }
            else{ // 만약 num[i]가 i+1과 같지 않고, 8-i와도 같지 않다면
                System.out.println("mixed"); // "mixed" 출력하기
                break; // 반복문 빠져 나가기
            }
        }
        
        s.close(); // 스캐너 s 종료하기
    }
}
