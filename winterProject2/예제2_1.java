// 정수를 담고 있는 2개의 배열을 합친 후 결과를 출력하는 코드
// 2개 배열을 합치는 로직은 함수로 만드시오
// 결과
// array 1: 2,4,5,6,3
// array 2: 1,3,4,5,6
// merge array: 2,4,5,6,3,1,3,4,5,6

package winterProject2;

import java.util.Arrays;

public class 예제2_1 {
    public static void main(String[] args) {
        int[] FA = {2,4,5,6,3};
        int[] SA = {1,3,4,5,6};
        int[] MA = plus(FA, SA);

        System.out.println("array 1: " + Arrays.toString(FA));
        System.out.println("array 2: " + Arrays.toString(SA));
        System.out.println("merge array: " + Arrays.toString(MA));
        //배열출력하는법: https://crmn.tistory.com/61 참고!!
    
    }
    //어떻게 합쳐야하는지 계속 고민하다가 그냥 복사붙여넣기 하면 안되나? 라고 생각
    //배열저장이 가능하다면 배열붙여넣기도 있을거라고생각
    //-> 참고사이트: https://velog.io/@hamsangjin/JAVA-%EB%B0%B0%EC%97%B4-%EB%B3%B5%EC%82%AC-%EB%A9%94%EC%86%8C%EB%93%9C
    //-> 참고사이트: https://e1jong.tistory.com/30
    //-> 참고사이트: https://eunplay.tistory.com/118
    public static int[] plus(int[] array1, int[] array2) { //plus 함수 
        int[] mergeArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArray, 0, array1.length);
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);
        return mergeArray;
    }        
}