// [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25] 가 들어있는 1차원 배열을 아래와같이 출력하시오
// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25
package winterProject3;

public class 예제3_3 {
    public static void main(String[] args) {
        // 첫째 줄: 1,2,3,4,5. 셋째= 1+10,2+10 - 반복 둘째: 10,9,8,7,6 넷째: 10+10,9+10-반복 이대로하면되려나 
        int[] TwFi = new int[25];//25까지 배열만들기 
        for (int i = 0; i < TwFi.length; i++) {
            TwFi[i] = i + 1;
        }
        for (int line = 0; line < 5; line++) { // 총 5줄 출력
            if (line % 2 == 0) { // 첫째, 셋째, 다섯째 줄 (순차 출력)
                for (int num = 0; num < 5; num++) {
                    System.out.print(TwFi[line * 5 + num] + " ");
                }
            }
            else { // 둘째, 넷째 줄 (역순 출력)
                for (int num = 4; num >= 0; num--) {
                    System.out.print(TwFi[line * 5 + num] + " ");
                }
            }
            System.out.println();
        }
    }
}
