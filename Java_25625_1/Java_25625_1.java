/*
3년만에 열리는 대면 SNUPC를 위해서, 민준이는 제2공학관으로 가고자 한다!
제2공학관에 가는 버스는 여러 가지가 있다. 관악02, 5511, 5513, 5516... 어떤 버스를 타더라도 단점이 있는데, 그것은 바로 돈이 든다는 점이다! 
돈을 한 푼이라도 아끼고자, 민준이는 셔틀버스를 타고 서울대입구역에서 제2공학관으로 가고 싶어한다.
현재 서울대입구역과 제2공학관 사이에는 셔틀버스가 정확히 한 대 운행되고 있다. 이 셔틀버스의 운행 수칙은 다음과 같다.
   -버스가 서울대입구역에서 제2공학관으로 이동하는 데에, 혹은 제2공학관에서 서울대입구역으로 이동하는 데에는 정확히 x분의 시간이 걸린다.
   -버스는 쉬지 않고 운행한다. 즉 서울대입구역 혹은 제2공학관에 도착하자마자 다시 제2공학관 혹은 서울대입구역을 향해 이동하기 시작한다. 
    이때 타고 내리는 데에 걸리는 시간은 무시하자.
현재 민준이는 서울대입구역에 있으며, 버스는 y분 후에 제2공학관으로 도착할 예정이다. 민준이가 버스에 최소 몇 분 뒤에 탑승할 수 있는지 계산해 보자.

첫째 줄에 정수 x와 y가 공백을 사이에 두고 주어진다. (2 ≤ x ≤ 100; 1 ≤ y < 2x; x ≠ y)

첫째 줄에 민준이가 버스에 탑승하기 위해서 기다려야 하는 최소 시간을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args[]){ // main 메소드
        Scanner a = new Scanner(System.in); // 새로운 스캐너 a 생성하기
        int x, y; // 변수 선언
        x=a.nextInt(); // 사용자로부터 정수 입력받기
        y=a.nextInt();
        
        if(y>=x){ // 만약, y가 x보다 크거나 같으면
            System.out.println(y-x); // y-x의 값 출력하기
        }
        else{ 
            System.out.println(x+y);
        }
    }
}
