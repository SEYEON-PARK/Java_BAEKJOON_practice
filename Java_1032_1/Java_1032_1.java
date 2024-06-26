/*
시작 -> 실행 -> cmd를 쳐보자. 검정 화면이 눈에 보인다. 여기서 dir이라고 치면 그 디렉토리에 있는 서브디렉토리와 파일이 모두 나온다.
이때 원하는 파일을 찾으려면 다음과 같이 하면 된다. dir *.exe라고 치면 확장자가 exe인 파일이 다 나온다. "dir 패턴"과 같이 치면 그 패턴에 맞는 파일만 검색 결과로 나온다.
예를 들어, dir a?b.exe라고 검색하면 파일명의 첫 번째 글자가 a이고, 세 번째 글자가 b이고, 확장자가 exe인 것이 모두 나온다.
이때 두 번째 문자는 아무거나 나와도 된다. 예를 들어, acb.exe, aab.exe, apb.exe가 나온다.
이 문제는 검색 결과가 먼저 주어졌을 때, 패턴으로 뭘 쳐야 그 결과가 나오는지를 출력하는 문제이다.
패턴에는 알파벳과 "." 그리고 "?"만 넣을 수 있다. 가능하면 ?을 적게 써야 한다. 그 디렉토리에는 검색 결과에 나온 파일만 있다고 가정하고, 파일 이름의 길이는 모두 같다.

첫째 줄에 파일 이름의 개수 N이 주어진다. 둘째 줄부터 N개의 줄에는 파일 이름이 주어진다. N은 50보다 작거나 같은 자연수이고 파일 이름의 길이는 모두 같고 길이는 최대 50이다.
파일이름은 알파벳 소문자와 '.' 로만 이루어져 있다.

첫째 줄에 패턴을 출력하면 된다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해
import java.util.ArrayList; // ArrayList를 사용하기 위해

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        ArrayList<String> list = new ArrayList<>(); // String형 ArrayList list 생성
        int num = s.nextInt(); // 사용자로부터 정수 입력받기
        s.nextLine(); // 버퍼 비우기!
        
        for(int i=0;i<num;i++){ // i가 0부터 num보다 작을 때까지 1씩 증가시키며 반복
            list.add(s.nextLine()); // 사용자로부터 문자열 입력받아 list에 추가하기!
        }
        
        for(int i=0;i<list.get(0).length();i++){ // i가 0부터 list 0번째 요소의 길이보다 작을 때까지 1씩 증가시키며 반복
            char compareChar = list.get(0).charAt(i); // list 0번째 요소의 i번째 문자를 compareChar에 대입
            boolean printChar = true; // printChar 변수 선언 및 초기화
            for(int j=1;j<num;j++){ // j에 1부터 num보다 작을 때까지 1씩 증가시킨 값을 대입하며 반복(0번째 요소는 초기값으로 있으므로 1부터!)
                if(list.get(j).charAt(i) != compareChar){ // 만약, list j번째 요소의 i번째 문자가 compareChar과 다르다면
                    System.out.print('?'); // '?' 출력하기
                    printChar = false; // printChar을 false로 바꾸기
                    break; // 가장 가까운 반복문 빠져 나가기!
                }
            } 
            if(printChar) { // 만약, printChar이 true라면
                System.out.print(compareChar); // compareChar 출력하기
            }
        }
        
        s.close(); // 스캐너 s 닫기
    }
}
