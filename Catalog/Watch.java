package Catalog;

public class Watch implements CatalogProduse{
    @Override
    public String getName() {
        return "Watch";
    }

    @Override
    public double getPrice() {
        return 299.99;
    }
}
