package Spotkanie2;

public class RangeLister {
    public static void main(String[] args) {
        RangeLister rangeLister = new RangeLister();
        int[] range =  rangeLister.makeRange(2,5);
        rangeLister.showRange(range);
    }
        int[] makeRange (int lower, int upper){
            int[] range = new int[(upper - lower) +1];
            for (int i = 0; i < range.length; i++) {
                range[i] = lower++;
            }
            return range;
        }
        void showRange(int[] range){
            System.out.print("Tablica: [ ");
            for (int i = 0; i < range.length; i++) {
                System.out.print(range[i]);
                if (i < range.length -1){
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");

        }
    }

