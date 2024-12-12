/* 
수학자가 구를 깎아서 볼록다면체를 만들었다. 이 수학자는 임의의 볼록다면체에 대해 (꼭짓점의 수) - (모서리의 수) + (면의 수) = 2가 성립한다는 것을 알고 있다.
그래서 구를 깎는 게 취미인 이 사람은 꼭짓점, 모서리와 면의 수를 기록할 때 꼭짓점과 모서리의 수만 세고 면의 수는 세지 않는다.

첫 번째 줄에 1 이상 100 이하의 자연수 T가 주어진다.
다음 T개의 줄에 4 이상 100 이하의 자연수 V와 E가 공백을 사이에 두고 주어진다. V와 E는 각각 꼭짓점의 개수와 모서리의 개수이다.

각 V와 E에 대해 볼록다면체의 면의 수를 한 줄에 하나씩 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args []){ // main 메소드
        Scanner s = new Scanner(System.in); // 스캐너 s 생성
        int N = s.nextInt(); // 사용자로부터 정수 입력받기
        
        for(int i=0;i<N;i++){ // i에 0부터 N이 되기 전까지 1씩 증가시킨 값을 대입하며 반복
            int V = s.nextInt(); // 정수 입력받기
            int E = s.nextInt(); // 정수 입력받기
            
            System.out.println(E-V+2); // 결과 출력하기
        }
        
        
        s.close(); // 스캐너 s 닫기
    }
}
