//임의의 정수를 입력받아 두 정수 사이의 값을 누적하여 더한 결과 출력하기
package winterProject1;

import java.util.Scanner;

public class 예제1_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("첫번째 자연수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 자연수를 입력하세요: ");
        int num2 = scanner.nextInt();
        
        
        int answer=0;
        int i = num1;
        while (i <= num2) {
            answer += i;  
            i++;          
        }


        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
        System.out.println("누적 합: "+ answer);
    }
    
}
