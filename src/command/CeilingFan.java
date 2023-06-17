package command;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public CeilingFan() {
        this("");
    }

    public void on() {
        System.out.println(name + " " + "シーリングファンが回っています");
    }

    public void off() {
        System.out.println(name + " " + "シーリングファンが止まっています");
    }
}
