// 접근지정자 사용 예제 (private 사용)
// 접근지정자 private 사용하여 비밀번호 지정 후 로그인 하는 예제 제작
// 결과:
// 설정하실 비밀번호를 입력하세요: 1234
// 비밀번호가 설정되었습니다.
// 로그인 하겠습니다. 비밀번호를 입력하세요: 1234
// 비밀번호가 일치합니다.

package winterProject1;

import java.util.Scanner;

public class 예제1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("설정하실 비밀번호를 입력하세요: ");
        String firstPassword = scanner.nextLine();//문자열 사용하기 위해 int 대신 String, nextInt 대신 nextLine 사용
        Password password = new Password(firstPassword);//위에서 입력받은 비밀번호 설정
        System.out.println("비밀번호가 설정되었습니다.");

        System.out.print("로그인 하겠습니다. 비밀번호를 입력하세요: ");
        String inputPassword = scanner.nextLine();

        if (password.checkPassword(inputPassword)) {
            System.out.println("비밀번호가 일치합니다. 환영합니다.");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}

class Password {
    private String password; //접근제어자 private사용

    public Password(String firstPassword) {
        this.password = firstPassword;
    }

    public boolean checkPassword(String inputPassword) {//boolean으로 비밀번호 확인
        return this.password.equals(inputPassword);
    }
}
