// [2,6,5,3,6,9]의 배열이 있다고 할 때, 새로운 배열을 만들어 요소를 반대로 채워서 출력하는 코드
// Original Array: 2,6,5,3,6,9
// New Array: 9,6,3,5,6,2

package winterProject1;

public class 예제1_3 {
    public static void main(String[] args) {
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
//마지막의 , 어떻게 처리하죠...............



// 1차 시도 실패
// Original Array: 2
// Original Array: 6
// Original Array: 5
// Original Array: 3
// Original Array: 6
// Original Array: 9
// New Array: 9
// New Array: 6
// New Array: 3
// New Array: 5
// New Array: 6
// New Array: 2
