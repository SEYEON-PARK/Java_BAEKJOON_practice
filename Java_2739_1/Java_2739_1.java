/*
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

출력형식과 같게 N*1부터 N*9까지 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해

class Main{ // Main 클래스
    public static void main(String args []){ // main 메소드
        Scanner a = new Scanner(System.in);
        int num=a.nextInt();
        for(int i=1;i<10;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
        
        a.close();
    }
}
