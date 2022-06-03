package Spotkanie3;

public class VisitCounter {
    private int counter;
    public  void inkrement(){
        counter++;
    }
    @Override
    public String toString() {
        return "VisitCounter{" +
                "counter=" + counter +
                '}';
    }
}
