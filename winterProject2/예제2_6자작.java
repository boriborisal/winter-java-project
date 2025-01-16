//상속을 활용하여 vehicle을 상속하는 car 과 bicycle 클래스를 만들어 출력하기
// 결과:
// vehicle: 차
// 바퀴 개수: 바퀴가 네 개 입니다.
// vehicle: 자전거
// 바퀴 개수: 바퀴가 두 개입니다.

package winterProject2;

public class 예제2_6자작 {
    public static void main(String[] args) {
        Car car = new Car();
        car.type = "차";
        System.out.println("vehicle: " + car.type);
        System.out.print("바퀴 개수: ");
        car.move();

        Bicycle bicycle = new Bicycle();
        bicycle.type = "자전거";
        System.out.println("vehicle: " + bicycle.type);
        System.out.print("바퀴 개수: ");
        bicycle.move();
    }
}
class Vehicle {
    String type;//변수설정
    void move() {
        System.out.println("움직입니다.");
    }
}
class Car extends Vehicle {//상속사용
    @Override//메소드오버라이딩사용
    void move() {
        System.out.println("바퀴가 네 개 입니다.");
    }
}
class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("바퀴가 두 개입니다.");
    }
}