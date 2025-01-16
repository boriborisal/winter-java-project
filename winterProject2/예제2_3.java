// [4,3,6,7,8,3,4,5,3,4,1] 배열을 [[4,3,6],[7,8,3],[4,5,3],[4,1]]식으로 2차원 배열로 변환하여 출력하시오.
// 2차원 배열을 만드는 부분은 함수로 만드시오.

//이거너무어려워서 2차원배열에대한공부 쫌 했습니다ㅠㅠㅠ 근데여전히모르겠어요 
package winterProject2;

public class 예제2_3 {
    public static void main(String[] args) {
        int[] inputArray = {4, 3, 6, 7, 8, 3, 4, 5, 3, 4, 1};
        int eachList = 3;

        int[][] result = makeIt2D(inputArray, eachList);//책 속에 예제에서는 double사용했는데 여기는 숫자만 있으니 int 사용했습니당

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print("[");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1) {
                    System.out.print(","); // 열 구분
                }
            }
            System.out.print("]");
            if (i < result.length - 1) {
                System.out.print(","); // 행 구분
            }
        }
        System.out.println("]");
    }

    public static int[][] makeIt2D(int[] array, int eachList) {//함수만들기 
        int[][] result = new int[(array.length + eachList - 1) / eachList][];//3차수정-행크기 계산하는 코드 추가

        for (int i = 0; i < 10; i++) {
            int start = i * eachList;
            int end = Math.min(array.length, start + eachList);

            result[i] = new int[end - start];
            System.arraycopy(array, start, result[i], 0, end - start);
        }
        return result;
    }
}
