package Spotkanie1;

public class NumberSystems {
    public static void main(String[] args) {
        // system dziesiętny
        //154 -> 1*10^2 + 5*10^1 + 4*10^0 = 100 + 50 + 4 = 154

        //system binarny (dwójkowy)
        //101 -> 1*2^2 + 0*2^1 + 1*2^0 = 4 + 0 + 1 = 5
        //5 ->
              //5 : 2 -> 1
              //2 : 2 -> 0
              //1 : 2 -> 1
              //czytamy od dolu do góry 101

        //system ósemkowy
        //47 -> 4*8^1 + 7*8^0 = 32 + 7 = 39

        //system szestnastkowy
        //3af -> 3*16^2 + 10*16^1 + 15*16^0 = 943

        System.out.println(Integer.toHexString(943));
    }
}
