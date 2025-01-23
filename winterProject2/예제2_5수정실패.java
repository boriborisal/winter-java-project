// 정수를 담고 있는 2개의 배열을 합친 후 결과를 출력하는 코드
// 2개 배열을 합치는 로직은 함수로 만드시오, 단, 중복된 값은 하나만 입력되도록
// 결과
// array 1: 2,4,5,6,3
// array 2: 1,3,4,5,6
// merge array: 2,4,5,6,3,1

package winterProject2;

public class 예제2_5수정실패 {
    public static void main(String[] args) {
        int[] FA = {2, 4, 5, 6, 3};
        int[] SA = {1, 3, 4, 5, 6};
        int[] MA = plus(FA, SA);

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























// package winterProject2;

// import java.util.Arrays;

// public class 예제2_5모르겠습니다 {
//     public static void main(String[] args) {
//         int[] FA = {2, 4, 5, 6, 3};
//         int[] SA = {1, 3, 4, 5, 6};
//         int[] MA = plus(FA, SA);

//         System.out.println("array 1: " + Arrays.toString(FA));
//         System.out.println("array 2: " + Arrays.toString(SA));
//         System.out.println("merge array: " + Arrays.toString(MA));
//     }

//     public static int[] plus(int[] array1, int[] array2) {
//         int[] tempArray = new int[array1.length + array2.length];//배열길이에맞춰 합치는 함수
//         int size = 0; // 실제로 저장된 요소의 개수를 추적
//         for (int value : array1) {
//             if (contains(tempArray, size, value) == false) {//2차수정에서 추가햇습니당-중복 없을 시에 수정정
//                 tempArray[size++] = value;
//             }
//         }
//         for (int value : array2) {
//             if (contains(tempArray, size, value) == false) {//여기도
//                 tempArray[size++] = value;
//             }
//         }
//         return Arrays.copyOf(tempArray, size);
//     }

//     public static boolean contains(int[] array, int size, int value) {
//         for (int i = 0; i < size; i++) {
//             if (array[i] == value) {//1차오류시 이것만있었음 
//                 return true;//중복이 있으면 true 반환
//             }
//         }
//         return false;
//     }
// }
// //1차오답-plus에서 구별만하고 삭제하는 코드 안넣어서 그냥 합쳐지기만 하고 변동 없었음 bool사용해서 true/false로 반환하게 함
