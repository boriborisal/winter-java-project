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

public class 예제2_4수정 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");//입력받기
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {//빈 공백 먼저 출력하기. number-1로 입력받은 수보다 하나 적게 출력, 아래에 자세히 후술
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {//별출력 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// for문: 공백과 별을 번갈아 출력하는형식
// 공백의 개수는 number - i
// ex.
// i = 1일 때 공백은 number - 1 = 4개
// i = 2일 때 공백은 number - 2 = 3개
// 이렇게 공백의 개수가 점점 줄어들음
// 1번째 줄 (i = 1):
// 공백: number - i = 5 - 1 = 4개
// 별: i = 1개
// 출력: " *"
// 2번째 줄 (i = 2):
// 공백: number - i = 5 - 2 = 3개
// 별: i = 2개
// 출력: " **"