package Spotkanie4.Interfaces;

public class DataProvidersApp {
    public static void main(String[] args) {
        DataProvider dataProvider = new FileDataProvider();
        DataPresenter dataPresenter = new DataPresenter();

        dataPresenter.showData(dataProvider);

    }
}
