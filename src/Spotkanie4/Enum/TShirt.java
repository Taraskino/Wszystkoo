package Spotkanie4.Enum;

public class TShirt {
    private TShirtSize size;
    private String manufacturer;

    public TShirt(TShirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
