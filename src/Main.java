import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        POSSystem posSystem = POSSystem.getInstance();
        System.out.println("欢迎光顾小店！");
        System.out.println("小店有商品如下：");
        for(ProductDescription pd:posSystem.getProductsCollection()){
            String display = "ID: " + pd.getID() + " " +
                    "Name: " + pd.getName() + " " +
                    "Price: " + pd.getPrice();
            System.out.println(display);
        }
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("请输入需要购买的产品编号：");
            String currID = scan.nextLine();
            int quantity;
            System.out.println("请输入购买数量");
            try{
                quantity = Integer.parseInt(scan.nextLine());
                posSystem.enterItem(currID,quantity);
            }catch (NumberFormatException nfe){
                System.err.println("数量错误~");
            }
        }while(false);
        System.out.println("请付钱：（目前只支持现金）");
        posSystem.makePayment(scan.nextDouble());
        posSystem.finishASale();
        posSystem.endPurchase();
        scan.close();

    }
}
