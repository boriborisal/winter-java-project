package winterProject1;

import java.util.Random; //ctrl shift O 로 불러냄

public class test1 {
	public static void main(String[] args) { 
        //파이썬에도 random 함수가 있었으므로 자바에도 있을 것이라 판단, 
        //이후 인터넷 웹사이트에서 random 함수 사용법을 찾아 적용, 참조 사이트 (https://e-you.tistory.com/214)
        Random random = new Random();
        int x[]= new int[50];//130페이지~ 참고. 배열 생성
        
        for (int i = 0; i <50; i++) {
            x[i] = random.nextInt(10); //배열에 랜덤숫자 50개 지정
        }

        int a = 0, b = 0, c = 0, d=0;
        for (int i = 0; i < 50; i++) {
        	int num = x[i];
        	if(num == 0)
        		d++;
        	else {
        		 if (num % 2 == 0)//97페이지 예제 2-11 참고
                 	a++;
                 if (num % 3 == 0)
                 	b++;
                 if (num % 5 == 0)
                 	c++;
        	}
        }

        System.out.println("2의 배수 개수: " + a);
        System.out.println("3의 배수 개수: " + b);
        System.out.println("5의 배수 개수: " + c);
        System.out.println("제외된 0의 개수: " + d);
        System.out.println("생성된 숫자:");
        for (int i = 0; i < 50; i++) {
        	System.out.print(x[i]);
            if ((i + 1) % 5 == 0) System.out.println(); 
            
        //포함된 메서드- 1.main 메서드 2.print 메서드 3.random 메서드
        //코드 실행 여부: O, 다만 1번째 열에서 4개만 출력되는 오류 있음.
        }
    }
}
