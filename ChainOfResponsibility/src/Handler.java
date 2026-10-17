public abstract class Handler {
    Handler next;
    Handler(){
        this.next =  null;
    }
    public abstract void dispense(int amount);
    public void setHandler(Handler next) {
        this.next = next;
    }
}
