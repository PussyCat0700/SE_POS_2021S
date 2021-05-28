import java.text.DecimalFormat;

public class Receipt implements IReceipt{
    private DecimalFormat df = new DecimalFormat("#.##");
    private String str;
    @Override
    public void print(Sale s) {
        transToString(s);
        writeToTxt();
    }
    private void transToString(Sale s){
        str = "TotalPayment:" +df.format(s.getTotal()) + "\n";
        str += (s.getBalance()<0)?"Payment Accomplished":"Balance:" + df.format(s.getBalance());

    }
    private void writeToTxt(){
        System.out.println(str);
    }
}
