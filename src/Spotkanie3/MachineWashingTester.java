package Spotkanie3;

public class MachineWashingTester {
    public static void main(String[] args) {
    WashingMachine wm = new WashingMachine();
        System.out.println(wm);

        wm.modeSensitiveClose();
        System.out.println(wm);

        wm.modeForTowelsAndBedLinen();
        System.out.println(wm);
    }
}
