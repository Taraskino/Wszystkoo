package Spotkanie2;

public class LoopsForFor {
    public static void main(String[] args) {
    out:    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + j + " ");
                if (i == 5 && j == 5){
                    break out;
                }
            }
            System.out.println();

        }
    }
}
