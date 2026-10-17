public class LightCommand implements ICommand{
    Light light;
    LightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
