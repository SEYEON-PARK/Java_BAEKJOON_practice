/*
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 
단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
또한 문자열은 공백으로 시작하거나 끝날 수 있다.

첫째 줄에 단어의 개수를 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner scanner=new Scanner(System.in); // 스캐너 scanner 생성
        int count=0; // 변수 선언 및 초기화
        String s=scanner.nextLine(); // 사용자로부터 공백을 포함한 문자열 입력받기
        
        for(int i=0;i<s.length();i++){ // i가 0부터 문자열 s의 길이보다 작을 때까지 i를 1씩 증가시키며 반복
            if(s.charAt(i)==' '){ // 만약, 문자열 s의 i번째 인덱스가 ' '(공백)이라면
                count++; // count를 1 증가시키기
            }
        }
        
        if(s.charAt(0)==' ' && s.charAt(s.length()-1)==' '){ // 만약, 문자열 s의 0번째 인덱스가 ' '(공백)이고, 마지막 인덱스도 ' '(공백)이라면
            System.out.println(count-1); // count-1의 값 출력하기
        }
        else if(s.charAt(0)==' ' || s.charAt(s.length()-1)==' '){ // 만약, 맨 끝 둘 다 ' '(공백)은 아니고, 문자열 s의 0번째 인덱스가 ' '(공백)이거나 마지막 인덱스가 ' '(공백)이라면
            System.out.println(count); // count의 값 출력하기
        }
        else{ // 맨 끝 둘 다 ' '(공백)이 아니라면
            System.out.println(count+1); // count+1의 값 출력하기
        }
    }
}
