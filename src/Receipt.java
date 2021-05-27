public class Receipt implements IReceipt{
    private String str;
    @Override
    public void print(Sale s) {
        transToString(s);
        writeToTxt();
    }
    private void transToString(Sale s){
        str = "TotalPayment:" +s.getTotal() + "\n";
        str += (s.getBalance()<0)?"Payment Accomplished":"Balance:" + s.getBalance();

    }
    private void writeToTxt(){
        System.out.println(str);
    }
}
