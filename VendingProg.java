import java.util.ArrayList;

public class VendingProg {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("fanta", 10.55f, "drink", 0.5f));
        products.add(new Product("cola", 8.33f, "drink", 0.5f));
        products.add(new HotDrinkProduct("tea", 5.58f, "hot drink", 0.2f, 100.00f));

        VendingMachine vendingMachine = new VendingMachine(products);

        // следующее обращение вызовет ошибку.
        // System.out.println(products.get(2).getTemperature());
        // нужно даункастить

        vendingMachine.findProductWithTemp();

        vendingMachine.printProductInterface();

        vendingMachine.buyingProduct();        

        



    }

}