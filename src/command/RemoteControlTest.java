package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOffCommand lightOn = new LightOffCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorDownCommand garageOpen = new GarageDoorDownCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
