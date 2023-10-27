package basic;

public class ConstructorOverloading {
    String name;
    int number;
    public ConstructorOverloading(String name) {
        this.name = name;
    }
    public ConstructorOverloading(String name, int number) {
        this.name = name;
        this.number= number;
    }
    public ConstructorOverloading() {
        this("이름없음", 0);
    }
}
