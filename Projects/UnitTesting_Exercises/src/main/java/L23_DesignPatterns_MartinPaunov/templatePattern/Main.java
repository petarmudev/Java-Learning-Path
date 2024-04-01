package L23_DesignPatterns_MartinPaunov.templatePattern;

public class Main {
    public static void main(String[] args) {
        TemplatePurchase purchase1 = new OnlinePurchase();
        TemplatePurchase purchase2 = new LocalStorePurchase();
        System.out.println();

        purchase1.purchaseOrder();

        System.out.println();

        purchase2.purchaseOrder();
    }
}
