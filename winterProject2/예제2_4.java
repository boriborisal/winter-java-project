// 임의의 자연수를 입력받아서 아래와 같이 탑이 출력되는 코드 만들기기
// 결과
// input number : 5
//     *
//    **
//   ***
//  ****
// *****
package winterProject2;

import java.util.Scanner;

public class 예제2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {//빈 공백 먼저 출력하기
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {//별출력 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
