package basic;

public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Car c = new Bus();
        Bus bus1 = (Bus)c;
        bus1.ppangppang();
        bus.run();
        bus.ppangppang();

        Car car = new Car();
        car.run();
//        car.ppangppang(); 자식이 갖고 있는 것이기 때문에 부모는 사용할 수 없음
    }
}
