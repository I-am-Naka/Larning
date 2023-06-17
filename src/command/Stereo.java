package command;

public class Stereo {
    public void on() {
        System.out.println("ステレオの電源が点いています");
    }

    public void off() {
        System.out.println("ステレオの電源が消えています");
    }

    public void setCd() {
        System.out.println("CDがセットされています");
    }

    public void setDvd() {
        System.out.println("DVDがセットされています");
    }

    public void setVolume(int volume) {
        System.out.println("音量が" + volume + "にセットされています");
    }
}
