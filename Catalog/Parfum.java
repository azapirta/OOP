package Catalog;

public class Parfum implements CatalogProduse {
    @Override
    public String getName() {
        return "Parfum";
    }

    @Override
    public double getPrice() {
        return (78.94);
    }
}
