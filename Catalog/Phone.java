package Catalog;

public class Phone implements CatalogProduse {
    @Override
    public String getName() {
        return "Phone";
    }

    @Override
    public double getPrice() {
        return (802.5);
    }
}
