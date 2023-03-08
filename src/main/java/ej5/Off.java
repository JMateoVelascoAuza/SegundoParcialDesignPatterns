package ej5;

public class Off implements IState{

    @Override
    public void resManager(PC pc) {
        System.out.println("PC is  off");
        pc.setOpenApps(new String[]{});
        pc.setCpuConsumption(0);
        pc.setRamConsumption(0);
        pc.showStatus();
    }
}
