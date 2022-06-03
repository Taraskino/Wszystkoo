package Laboratorium7;

public class Convert {
    public static void main(String[] args) {
        String number = "1010101010101011";
        long ourNumbOfInt = 0l;
        for (int i = 0; i < number.length(); i++) {
            int returnNumberIndex = number.length() - 1 - i;
            char c = number.charAt(returnNumberIndex);
            int bit = Character.getNumericValue(c);
            ourNumbOfInt += bit * Math.pow(2, i);
        }
        System.out.println(ourNumbOfInt);
    }
}
