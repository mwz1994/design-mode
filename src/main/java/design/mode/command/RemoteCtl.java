package design.mode.command;

public class RemoteCtl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
