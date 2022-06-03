package Spotkanie3;

public class SubPrinter extends Printer{
    int z = 2;

        void printMe() {
        System.out.println("z wynosi " + z);
        System.out.println("Jestem ekzemplarzem klasy " + this.getClass().getName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();
    }
}
