package basic;

public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        int i = cal.exec(3, 4);
        System.out.println(i);
    }
}
