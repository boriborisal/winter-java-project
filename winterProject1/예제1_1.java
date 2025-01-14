// 임의의 두 자연수를 입력받아서 두 수의 차를 구하시오
// 차가 0보다 작으면 0으로 출력, 
// 결과: 
// num1: 4
// num2: 1
// 두 수의 차: 3

package winterProject1;

import java.util.Scanner;//Alt + Shift + O

public class 예제1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Q.얘 꼭 닫아야해요??
        System.out.print("첫번째 자연수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 자연수를 입력하세요: ");
        int num2 = scanner.nextInt();
        System.out.println( "num1: " + num1 );
        System.out.println( "num1: " + num2 );
        int answer =  num1-num2;//중간오류: ;자꾸 까먹음음
        if(answer <= 0) {//중간오류: 중괄호안씀
            answer = 0;
            System.out.println("두 수의 차: "+ answer);//중간오류: 파이썬마냥 생각하고 ',' 씀 자바는 +만~
        }
        else {
            System.out.println("두 수의 차: "+ answer);
        }   
    }
}