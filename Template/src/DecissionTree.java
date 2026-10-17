public class DecissionTree extends ModelClass{
    @Override
    protected void loadData() {
        System.out.println("DECISION TREE LOAD DATA");
    }

    @Override
    protected void preProcessData() {
        System.out.println("DECISION TREE DATA PROCESS");
    }

    @Override
    protected void trainModel() {
        System.out.println("DECISION TREE TRAIN MODEL");
    }

    @Override
    protected void evaluate() {
        System.out.println("DECISION TREE EVALUATE MODEL");
    }

    @Override
    protected void saveModel() {
        System.out.println("DECISION TREE SAVE MODEL");
    }
}