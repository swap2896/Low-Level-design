public class FanCommand implements ICommand{
    Fan fan;
    FanCommand(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        this.fan.on();
    }

    @Override
    public void undo() {
        this.fan.off();
    }
}
