public class FiveHundredHandler extends Handler{

    int numOfNotes = 0;
    FiveHundredHandler(int numOfNotes){
        this.numOfNotes = numOfNotes;
    }
    @Override
    public void dispense(int amount) {
        int notesNeeded = amount / 500;
        if(notesNeeded > numOfNotes) {
            notesNeeded = numOfNotes;
            numOfNotes = 0;
        } else {
            numOfNotes -= notesNeeded;
        }
        if (numOfNotes >= 0) {
            System.out.println("Despensing 500 Rs notes "+ notesNeeded);
        }
        int remaingAmount = amount - (notesNeeded * 500);
        if(remaingAmount > 0){
            if(next !=null){
                next.dispense(remaingAmount);
            }else{
                System.out.println("Remaining amount of "+ remaingAmount + " cannot be full filled due to insufficient funds");
            }
        }
    }
}
