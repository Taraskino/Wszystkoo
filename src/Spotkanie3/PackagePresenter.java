package Spotkanie3;

public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("dzień dobry");
    }

    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();

    }
    public void showPackage(){
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.println(" w pakecie " + this.getClass().getPackageName());
    }
}
