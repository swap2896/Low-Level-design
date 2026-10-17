import subsystem.*;

public class Facade {
    private Bios bios;
    private CoolingSystem coolingSystem;
    private Cpu cpu;
    private Memory memory;
    private PowerSupply powerSupply;
    Facade() {
        bios =  new Bios();
        coolingSystem = new CoolingSystem();
        cpu = new Cpu();
        memory = new Memory();
        powerSupply = new PowerSupply();
    }
    public void execute(){
        bios.bootUp();
        coolingSystem.cooling();
        cpu.attachCpu();
        memory.attachMemory();
        powerSupply.attach();
    }
}
