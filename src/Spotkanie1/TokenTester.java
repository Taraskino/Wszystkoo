package Spotkanie1;

import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {
        StringTokenizer st1, st2;
        String quote1 = "GOOGLE 530,80 -9,98";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());

        String quote2 = "RHY@00@33,2";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("Token 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());


    }
}
