import java.util.Collection;

public class POSSystem {
    private static POSSystem singleton;
    private Sale curSale;
    private ProductCatalog productCatalog;

    private POSSystem() {
        loadCatalog();
        makeNewSale();
    }

    public static POSSystem getInstance() {
        if (singleton == null) singleton = new POSSystem();
        return singleton;
    }

    public void loadCatalog() {
        productCatalog = new ProductCatalog();
    }

    public void makeNewSale() {
        curSale = new Sale();
    }

    public void enterItem(String id, int quantity) {
        ProductDescription description = productCatalog.getProductDesc(id);
        curSale.makeLineItem(description, quantity);
    }

    public void endPurchase() {
        curSale.beComplete();
    }

    public void makePayment(double cash) {
        curSale.makePayment(cash);
    }

    public void finishASale() {
        curSale.finishASale();
    }

    public Collection<ProductDescription> getProductsCollection() {
        return productCatalog.getProductsCollection();
    }
}
