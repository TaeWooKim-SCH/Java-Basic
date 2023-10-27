public class Enum {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = Enum.MALE;
        gender1 = Enum.FEMALE;

        gender1 = "boy"; // MALE과 FEMALE 둘 중 한 값만 넣고 싶을 땐 어떻게 해야 할까? -> enum 사용

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

//        gender2 = "boy"; // 에러남

    }
}

// enum
enum Gender {
    MALE, FEMALE
}