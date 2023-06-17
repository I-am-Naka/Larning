package singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
    }

    public enum Singleton {
        UNIQUE_INSTANCE;
    }
}
