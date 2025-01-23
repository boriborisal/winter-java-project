// 정수를 담고 있는 2개의 배열을 합친 후 결과를 출력하는 코드
// 2개 배열을 합치는 로직은 함수로 만드시오
// 결과
// array 1: 2,4,5,6,3
// array 2: 1,3,4,5,6
// merge array: 2,4,5,6,3,1,3,4,5,6

package winterProject2;

public class 예제2_1수정 {
    public static void main(String[] args) {
        int[] FA = {2, 4, 5, 6, 3};
        int[] SA = {1, 3, 4, 5, 6};
        int[] MA = plus(FA, SA);

        //다른 구현 방식을 참고해보려고 했는데 이해가 안가서 좀..귀찮은 방식이지만 전부 for문 사용햇습니다ㅜㅜㅜ
        System.out.print("array 1: ");
        for (int i = 0; i < FA.length; i++) {
            System.out.print(FA[i]);//
            if (i < FA.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.print("array 2: ");
        for (int i = 0; i < SA.length; i++) {
            System.out.print(SA[i]);
            if (i < SA.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.print("merge array: ");
        for (int i = 0; i < MA.length; i++) {
            System.out.print(MA[i]);
            if (i < MA.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static int[] plus(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }
        return result;
    }
}