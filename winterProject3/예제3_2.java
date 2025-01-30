// 임의의 영어 문자열을 입력받은 후 모음만 제거하고 출력하는 프로그램
package winterProject3;

import java.util.Scanner;

public class 예제3_2 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String eng = sc.nextLine(); //문자열 입력받기
        String result = "";// 결과를 저장할 문자열

        // 문자열을 한 글자씩 검사
        for (int i = 0; i < eng.length(); i++) {
            char ch = eng.charAt(i);

            // 모음인지 하나하나 비교....for문적용 어떻게할지 고민좀요...
            if (ch == 'a') {
                // 모음이니까 안 더함
            } else if (ch == 'e') {
                // 얘도 안 더함
            } else if (ch == 'i') {
                // 이것도 안 더함
            } else if (ch == 'o') {
                // 이것도
            } else if (ch == 'u') {
            
                // 대문자도 하나씩 다 비교
            } else if (ch == 'A') {
            } else if (ch == 'E') { // 안 더함
            } else if (ch == 'I') {
            } else if (ch == 'O') {
            } else if (ch == 'U') {
            } else {
                // 모음이 아니면 결과 문자열에 추가
                result = result + ch;
            }
        }
        System.out.println("모음 제거: " + result);
    
        
    }
}
// Scanner sc= new Scanner(System.in); 
//         System.out.print("문자를 입력하세요: ");
//         String eng = sc.nextLine();
//         char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};//모음만있는배열

//         String result = "";