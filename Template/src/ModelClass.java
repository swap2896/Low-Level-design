public abstract class ModelClass {
    protected abstract void loadData();
    protected abstract void preProcessData();
    protected abstract void trainModel();
    protected abstract void evaluate();
    protected abstract void saveModel();
    public final void templateMethod() {
        System.out.println("Creating Model");
        loadData();
        preProcessData();
        trainModel();
        evaluate();
        saveModel();
    }
}
