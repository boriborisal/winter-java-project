package winterProject1;

import java.util.Scanner;

public class 예제1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// 첫번째 시도->실패패
// input number: 5
// *
// *
// *
// *
// *
