// [4,3,6,7,8,3,4,5,3,4,1] 배열에서 각 숫자가 몇 개 있는 지 수를 세서 결과를 출력하는 코드

package winterProject2;

public class 예제2_2수정 {
    public static void main(String[] args) {
        int[] A = {4, 3, 6, 7, 8, 3, 4, 5, 3, 4, 1};

        int one = 0;
        int two = 0;
        int thr = 0;
        int fou = 0;
        int fiv = 0;
        int six = 0;
        int sev = 0;
        int eig = 0;

        for (int num : A) {//노가다 했는데... 이게맞는걸까요? 일단 정답은 맞게나옵니다 
            if (num == 1) {
                one++;
            } else if (num == 2) {
                two++;
            } else if (num == 3) {
                thr++;
            } else if (num == 4) {
                fou++;
            } else if (num == 5) {
                fiv++;
            } else if (num == 6) {
                six++;
            } else if (num == 7) {
                sev++;
            } else if (num == 8) {
                eig++;
            }
        }
        System.out.println("1는 " + one + "번 출현했습니다.");
        System.out.println("2는 " + two + "번 출현했습니다.");
        System.out.println("3는 " + thr + "번 출현했습니다.");
        System.out.println("4는 " + fou + "번 출현했습니다.");
        System.out.println("5는 " + fiv + "번 출현했습니다.");
        System.out.println("6는 " + six + "번 출현했습니다.");
        System.out.println("7는 " + sev + "번 출현했습니다.");
        System.out.println("8는 " + eig + "번 출현했습니다.");
    }
}