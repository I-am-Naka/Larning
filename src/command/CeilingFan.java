package command;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("ファンの強さは「強」です");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("ファンの強さは「中」です");

    }

    public void low() {
        speed = LOW;
        System.out.println("ファンの強さは「弱」です");

    }

    public void off() {
        speed = OFF;
        System.out.println("ファンは止まっています");

    }

    public int getSpeed() {
        return speed;
    }
}
