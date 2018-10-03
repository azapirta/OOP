package Catalog;

public class Bracelet implements CatalogProduse {
    @Override
    public String getName() {
        return "Bracelet";
    }

    @Override
    public double getPrice() {
        return 19.99;
    }
}
