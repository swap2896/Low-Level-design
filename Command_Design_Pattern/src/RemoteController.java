public class RemoteController {

    int numButtons = 4;
    ICommand commands[] = new ICommand[numButtons];
    boolean buttonPressed[] = new boolean[numButtons];

    public RemoteController(){
        for(int i=0;i<numButtons;i++){
            commands[i]=null;
            buttonPressed[i]=false;
        }
    }

    void setCommands(int index, ICommand command){
        if(index>=0 && index<numButtons){
            commands[index] = command;
            buttonPressed[index] = false;
        }
    }

    void pressButton(int index) {
        if(index>=0 && index<numButtons && commands[index]!=null){
            if (buttonPressed[index] == false) {
                commands[index].execute();
            }else {
                commands[index].undo();
            }
            buttonPressed[index]=!buttonPressed[index];
        }
        else {
            System.out.println("Please press a valid buttton");
        }
    }

}
