// package command;

// public class RemoteLoader_lambda {
//     public static void main(String[] args) {
//         RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

//         Light livingRoomLight = new Light("リビングルーム");
//         Light kitchenLight = new Light("キッチン");
//         CeilingFan ceilingFan = new CeilingFan("リビングルーム");
//         GarageDoor garageDoor = new GarageDoor("ガレージ");
//         Stereo stereo = new Stereo("リビングルーム");

//         remoteControl.setCommand(0, () -> livingRoomLight.on(),
//                                     () -> livingRoomLight.off());
//         remoteControl.setCommand(1, () -> kitchenLight.on(),
//                                     () -> kitchenLight.off());
//         remoteControl.setCommand(2, () -> ceilingFan.on(),
//                                     () -> ceilingFan.off());
//         remoteControl.setCommand(3, () -> garageDoor.up(),
//                                     () -> garageDoor.down());

//         System.out.println(remoteControl);

//         remoteControl.onButtonWasPressed(0);
//         remoteControl.offButtonWasPressed(0);
//         remoteControl.onButtonWasPressed(1);
//         remoteControl.offButtonWasPressed(1);
//         remoteControl.onButtonWasPressed(2);
//         remoteControl.offButtonWasPressed(2);
//         remoteControl.onButtonWasPressed(3);
//         remoteControl.offButtonWasPressed(3);
//     }
// }
