package command;

public class Stereo {
    String name;

    public Stereo() {
        this("");
    }

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " " + "ステレオの電源が点いています");
    }

    public void off() {
        System.out.println(name + " " + "ステレオの電源が消えています");
    }

    public void setCd() {
        System.out.println(name + " " + "CDがセットされています");
    }

    public void setDvd() {
        System.out.println(name + " " + "DVDがセットされています");
    }

    public void setVolume(int volume) {
        System.out.println(name + " " + "音量が" + volume + "にセットされています");
    }
}
