package basic;

public interface Calculator {
    int plus(int i, int j);
    int multiple(int i, int j);

    // java 8이상부터 인터페이스에서 default로 접근제한자를 설정하면 메서드를 선언할 수 있음
    default int exec(int i, int j) {
        return i + j;
    }
    // static한 메서드는 반드시 인터페이스명.메서드명 형식으로만 호출 가능
    static int exec2(int i, int j) {
        return i + j;
    }
}
