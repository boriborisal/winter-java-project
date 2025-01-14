// 3번 문제에서 '새로운 배열을 만들어 요소를 반대로 출력' 하는 코드를 함수로 만들어 완성

package winterProject1;

public class 예제1_5 {
    public static void main(String[] args) { //https://blog.naver.com/heartflow89/220951776433 참고 
        opposit();     
    }
    public static void opposit() {
        int[] OA = {2, 6, 5, 3, 6, 9};
        System.out.print("Original Array: ");
        for (int i = 0; i <OA.length; i++) {
            System.out.print(OA[i] + ",");  
        }
        System.out.println(" ");
        System.out.print("New Array: ");
        for (int i = OA.length - 1; i >= 0; i--) {
            System.out.print(OA[i] + ",");
        }
    }

}
