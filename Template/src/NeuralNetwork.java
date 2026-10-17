public class NeuralNetwork extends ModelClass {
    @Override
    protected void loadData() {
        System.out.println("NEURAL NETWORK LOAD DATA");
    }

    @Override
    protected void preProcessData() {
        System.out.println("NEURAL NETWORK DATA PROCESS");
    }

    @Override
    protected void trainModel() {
        System.out.println("NEURAL NETWORK TRAIN MODEL");
    }

    @Override
    protected void evaluate() {
        System.out.println("NEURAL NETWORK EVALUATE MODEL");
    }

    @Override
    protected void saveModel() {
        System.out.println("NEURAL NETWORK SAVE MODEL");
    }
}
