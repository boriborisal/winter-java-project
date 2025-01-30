// 다음 코드를 실행할 때, 아래 결과를 출력하는 함수(myreplace)를 구현하시오
// String str = "Hello World";
// String result = myreplace(str1, "World", "Kim")
// System.out.println(result)
// 결과
// Hello Kim

//??? ?? ?????? ?????? str1이요? .... 네? 1이뭐죠?
//그러니까 myreplace= 겹치는 문자열 삭제 후 출력 인가? 
//myreplace순: str(Hello World)+ World + kim >> World 삭제 후 나머지 출력 
//수정-replace 함수찾음 
package winterProject3;

public class 예제3_4실패 { 
    public static void main(String[] args) {
        String str = "Hello World";
        String result = myreplace(str, "World", "Kim");//왜 인식을몬하나요?
        System.out.println(result);
    }
    public static String myreplace(String str, String target, String replacement) {//먼저 만들어두기
        return str.replace(target, replacement);
    }

}


