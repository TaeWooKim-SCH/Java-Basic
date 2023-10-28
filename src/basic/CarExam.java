package basic;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car("카");
        Car c2 = new Car("카");

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;

        String name = new String("태우");

        int length = c2.name.length();

        if (name == "태우") {
            System.out.println("태우입니다.");
        }

        System.out.println(c2.name.length());

        System.out.println(c1.name);
    }
}
