package headFirstCommand;

/**
 * Created by muzi on 2017/6/15.
 */
public class RemoteLoader {

    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereOnWithCDCommand stereoOnWhithCD = new StereOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWhithCD, stereoOffCommand);

        System.out.println(remoteControl.toString());

        /*remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();*/

        //宏命令
        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, stereoOnWhithCD};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, stereoOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);
        System.out.println("---Pushing Macro On---");
        remoteControl.onButtonWasPushed(4);
        System.out.println("---Pushing Macro Off---");
        remoteControl.offButtonWasPushed(4);
        System.out.println("---Pushing Macro Undo---");
        remoteControl.undoButtonWasPushed();
    }
}
