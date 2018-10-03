package Catalog;

public class Laptop implements CatalogProduse {
    @Override
    public String getName() {
        return "Laptop";
    }

    @Override
    public double getPrice() {
        return (1050.99);
    }
}
