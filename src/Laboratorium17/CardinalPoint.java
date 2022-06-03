package Laboratorium17;

public enum CardinalPoint {
    N("Północ", "North",0),
    E("Wschód", "East", 90),
    S("Południe", "South", 180),
    W("Zachód", "West", 280),
    NE("Północny wschód", "Northeast", 45),
    SE("Południowy wschód", "Southeast", 135),
    SW("Południowy zachód", "Southwest", 225),
    NW("Południowy zachód", "Northwest", 315);

    private String namePl;
    private String nameEn;
    private int location;

    CardinalPoint(String namePl, String nameEn, int location) {
        this.namePl = namePl;
        this.nameEn = nameEn;
        this.location = location;
    }

    public String getNamePl() {
        return namePl;
    }

    public void setNamePl(String namePl) {
        this.namePl = namePl;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CardinalPoint{" +
                "namePl='" + namePl + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", location=" + location +
                '}';
    }
}
