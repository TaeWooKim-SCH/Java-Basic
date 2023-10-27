package basic;

public class ReferenceTypes {
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";

        if (str1 == str2) {
            System.out.println("str1과 str2는 같은 주소값을 참조합니다.");
        }

        // new 연산자를 이용하면 계속 새로운 힙 영역에 담김
        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str3 == str4) {
            System.out.println("str3과 str4는 같은 주소값을 참조합니다.");
        }

        if (str3.equals(str4)) {
            System.out.println("equals 함수를 쓸 땐 str3와 str4는 같다고 판단됩니다.");
        }

        System.out.println("str3과 str4는 다른 주소값을 참조합니다.");
    }
}
