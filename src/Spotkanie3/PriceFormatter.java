package Spotkanie3;

public class PriceFormatter {
    String currency = "zł";
    String formatPrice (int value){
        return String.format("%d,00 %s", value, currency);
    }
    String formatPrice (double value){
        return String.format("%.2f %s", value, currency);
    }
    String formatPrice (String value){
        return String.format("%.2f %s", Double.parseDouble(value), currency);
    }

    public static void main(String[] args) {
        PriceFormatter priceFormatter = new PriceFormatter();
        priceFormatter.currency =  "PLN";
        System.out.println(priceFormatter.formatPrice(5));

        System.out.println(priceFormatter.formatPrice(89.9));

        System.out.println(priceFormatter.formatPrice("500"));


    }
}
