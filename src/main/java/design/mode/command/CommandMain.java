package design.mode.command;

public class CommandMain {
    public static void main(String[] args) {
        //new Light
        Light light = new Light();
        //new RemoteCtl
        RemoteCtl remoteCtl = new RemoteCtl();
        //light on
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteCtl.setCommand(lightOnCommand);
        remoteCtl.execute();
        //light off
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteCtl.setCommand(lightOffCommand);
        remoteCtl.execute();
    }
}
