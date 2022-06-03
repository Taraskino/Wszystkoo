package Laboratorium12;

public class Library {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Pan samochodzik i zlota rekawica", "Zbigniew nenacki", "Siedmiorog", 2018),
                new Book("Pan samochodzik i zlota rekawica", "Zbigniew nenacki", "Siedmiorog", 2018),
                new Book("Pan samochodzik i templariusze", "Zbigniew nenacki", "Siedmiorog", 2017),
        };
        Book book1 = books[0];
        Book book2 = books[1];
        Book book3 = books[2];

        System.out.println("Ksiązka 1: " + book1);
        System.out.println("Ksiązka 3: " + book3);
        if (book1.equals(book3)){
            System.out.println("To ta sama ksiązka");
        } else {
            System.out.println("To dwie różne książki");
        }
    }
}
