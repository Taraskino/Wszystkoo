package Laboratorium7;

public class Convert2 {
    public static void main(String[] args) {
        String number = "11";
        long ourNumbOfInt = 0l;
        int q = 0;
        for (int i = number.length()-1; i >= 0; i--) {
            char c = number.charAt(i);
            int bit = Character.getNumericValue(c);
            ourNumbOfInt += bit * (int)Math.pow(2,q);
            q++;
        }
        System.out.println(ourNumbOfInt);
    }
}
