import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SaleLineItem> lineItems;
    private boolean isComplete;
    private Payment payment;
    public Sale(){
        lineItems = new ArrayList<>();
    }
    public void makeLineItem(ProductDescription productDescription,int quantity){
        lineItems.add(new SaleLineItem(productDescription,quantity));
    }
    public void beComplete(){
        isComplete = true;
    }
    public double getTotal(){
        double ret = 0.0;
        for(SaleLineItem sli:lineItems){
            ret+=sli.getSaleLinePrice();
        }
        return ret;
    }
    public void makePayment(double cash){
        payment = new Payment(cash);
    }
    public double getBalance(){
        return getTotal()- payment.getCash();
    }
    public void finishASale(){
        Receipt receipt = new Receipt();
        receipt.print(this);
    }
}
