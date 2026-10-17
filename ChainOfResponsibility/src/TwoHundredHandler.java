public class TwoHundredHandler extends Handler{
    int numOfNotes = 0;
    TwoHundredHandler(int numOfNotes){
        this.numOfNotes = numOfNotes;
    }
    @Override
    public void dispense(int amount) {
        int notesNeeded = amount / 200;
        if(notesNeeded > numOfNotes) {
            notesNeeded = numOfNotes;
            numOfNotes = 0;
        } else {
            numOfNotes -= notesNeeded;
        }
        if (numOfNotes >= 0) {
            System.out.println("Despensing 200 Rs notes "+ notesNeeded);
        }
        int remaingAmount = amount - (notesNeeded * 200);
        if(remaingAmount > 0){
            if(next !=null){
                next.dispense(remaingAmount);
            }else{
                System.out.println("Remaining amount of "+ remaingAmount + " cannot be full filled due to insufficient funds");
            }
        }
    }
}
