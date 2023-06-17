package command;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public GarageDoor() {
        this("");
    }

    public void up() {
        System.out.println(name + " " + "ガレージのドアは開いています");
    }

    public void down() {
        System.out.println(name + " " + "ガレージのドアは閉じています");
    }
}
