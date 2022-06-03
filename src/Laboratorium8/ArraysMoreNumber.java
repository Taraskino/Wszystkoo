package Laboratorium8;

public class ArraysMoreNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[10];
        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }
        int mostFrequent = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]){
                mostFrequent = i;
            }
        }
        System.out.print("Najczęsciej występowaną liczbą jest " + mostFrequent);
        System.out.println(". Wystąpiła " + counters[mostFrequent] + " razy.");
    }
}
