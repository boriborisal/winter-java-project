// [4,3,6,7,8,3,4,5,3,4,1] 배열에서 각 숫자가 몇 개 있는 지 수를 세서 결과를 출력하는 코드

package winterProject2;

public class 예제2_2 {
    public static void main(String[] args) {
        int A[] = {4,3,6,7,8,3,4,5,3,4,1};
        int[] count = new int[9];//1~8까지 숫자가 들어갈 배열 만들기기

        for (int num : A) {
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            System.out.println(i + "는" + count[i] + "번 출현 했습니다.");
        }
    }
}
// 첫시도에서 이런식의 시도를 했는데
// 너무 번거롭고 이거 아닌것 같아서 좀 찾아봤습니당
// int one = 0;
// int two = 0;
// int thr = 0;
// int fou = 0;
// int fiv = 0;
// int six = 0;
// for(int i : A){
// 	if(i == 1){
//     	one++;
//     }
        