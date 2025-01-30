// 0-9 임의의 숫자 50개를 생성해서 각 숫자가 몇 개 생성되었는지 카운트하여 출력하는 프로그램.
// 카운트하는 함수와 결과를 출력하는 함수를 각각 만드시오.

package winterProject3;

import java.util.Random;

public class 예제3_1 {
    static int[] count = new int[10]; //배열 만들어두기
    static int[] fif = new int[50];
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < fif.length; i++) {
            fif[i] = random.nextInt(10);
        }
        //임의의 50개숫자 생성하기 전에 배열만들기
        // int fif[] = new int[50];
        // Random random = new Random();//랜덤 사용 
        // for (int i = 0; i < fif.length; i++) {
        //     fif[i] = random.nextInt(10); //0부터 9까지 50개숫자 생성
        // }
        //위에 코드를 해보니까 fif를 다른클래스에서 인식을 못함. 그래서 메인클래스에서빼서 위로 올렸습니다.
        count();
        print();   //출력!!
    }
    public static void count() {
        for (int num : fif) {
            count[num]++; 
        }
    }
    public static void print() {
        for (int i = 0; i < count.length; i++) {// for문사용해서 줄이기
            System.out.println(i + "은(는) " + count[i] + "번 출현했습니다.");
        }
    }
}


// 1차시도 for문 변환 전
// int zer = 0;
//         int one = 0;
//         int two = 0;
//         int thr = 0;
//         int fou = 0;
//         int fiv = 0;
//         int six = 0;
//         int sev = 0;
//         int eig = 0;
//         int nin = 0;

//         for (int num : fif) { 
//             if (num == 1) {
//                 one++;
//             } else if (num == 0) {
//                 zer++;
//             } else if (num == 2) {
//                 two++;
//             } else if (num == 3) {
//                 thr++;
//             } else if (num == 4) {
//                 fou++;
//             } else if (num == 5) {
//                 fiv++;
//             } else if (num == 6) {
//                 six++;
//             } else if (num == 7) {
//                 sev++;
//             } else if (num == 8) {
//                 eig++;
//             } else if (num == 9) {
//                 nin++;
//             }
//         }
//     }
