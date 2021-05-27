
public class Payment implements IPayment{
    private final double cash;

    public Payment(double cash) {
        this.cash = cash;
    }
    @Override
    public double getCash() {
        return cash;
    }
}
