// 임의의 두 자연수를 입력받아서 두 수의 차를 구하시오
// 차가 0보다 작으면 0으로 출력, 
// 결과: 
// num1: 4
// num2: 1
// 두 수의 차: 3

package winterProject1;

import java.util.Scanner;

public class 예제1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 자연수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 자연수를 입력하세요: ");
        int num2 = scanner.nextInt();
        System.out.println( "num1: " + num1 );
        System.out.println( "num1: " + num2 );
        int answer =  num1-num2;
        if(answer <= 0) {
            answer = 0;
            System.out.println("두 수의 차: "+ answer);
        }
        else {
            System.out.println("두 수의 차: "+ answer);
        }   
    }
}