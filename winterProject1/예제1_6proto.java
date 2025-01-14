// 접근지정자 사용 예제 (private 사용)
// 접근지정자 private을 사용하여 비밀번호 지정 후 로그인 하는 예제 제작
// 결과:
// 설정하실 비밀번호를 입력하세요: 1234
// 비밀번호가 설정되었습니다.
// 로그인 하겠습니다. 비밀번호를 입력하세요: 1234
// 비밀번호가 일치합니다.

// package winterProject1;

// import java.util.Scanner;

// public class 예제1_6자율 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("설정하실 비밀번호를 입력하세요: ");
//         String userPassword = scanner.nextLine();//문자열 사용하기 위해 int 대신 String, nextInt 대신 nextLine 사용
//         Password password = new Password(userPassword);//위에서 입력받은 비밀번호 설정
//         System.out.println("비밀번호가 설정되었습니다.");

//         System.out.print("로그인 하겠습니다. 비밀번호를 입력하세요: ");
//         String inputPassword = scanner.nextLine();//입력받아 userPassword와 비교함

//         if (password.verifyPassword(inputPassword)) {
//             System.out.println("비밀번호가 일치합니다. 로그인 되었습니다.");
//         } else {
//             System.out.println("비밀번호가 일치하지 않습니다.");
//         }
//     }
// }

// class Password {//비밀번호 확인 과정을 위해 클래스 추가
//     private String password;//비밀번호 유출방지로 private사용

//     public Password(String initialPassword) {
//         this.password = initialPassword;
//     }

//     public boolean verifyPassword(String inputPassword) {//TF확인 위해 boolean 사용 
//         return this.password.equals(inputPassword);//equals로 같은건지 확인
//     }
// }