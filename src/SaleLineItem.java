public class SaleLineItem {
    private int quantity;
    private ProductDescription product;

    public SaleLineItem( ProductDescription product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    public double getSaleLinePrice(){
        return quantity*product.getPrice();
    }
}
