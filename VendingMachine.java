import java.util.*;

public class VendingMachine {
    public ArrayList<Product> products = new ArrayList<>();

    public VendingMachine(ArrayList<Product> products) {
        this.products = products;
    }

    public void findProductWithTemp() {
        for (Product product: this.products) {
            if (product instanceof HotDrinkProduct) {
                HotDrinkProduct hotDrink = (HotDrinkProduct) product;
                System.out.println("Температура " + hotDrink.getTemperature() + "\n");
            }
        }
    }

    public void printProductInterface() {
        int i = 1;
        for (Product product: this.products) {
            System.out.println(i++ + " " + product.getProduct());
            
        }
    }

    public void buyingProduct() {
        Integer userChoise = this.choosingProduct();
        
        if (userChoise > 0 && userChoise < this.products.size()+1) {
            this.deposingMoney(userChoise);
        }
      
    }

    public Integer choosingProduct() {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("\n" + "Введите цифру от 1 до " + this.products.size());
        Integer userChoise = Integer.parseInt(myObj.nextLine());
        try {
            System.out.println("\n" + "Вы выбрали " + this.products.get(userChoise-1).getProduct());
            
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вы выбрали не существующий продукт");
        }

        // myObj.close();
        return userChoise;
    }

    public void deposingMoney(Integer userChoise) {
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("\n" + "Внесите пожалуйста деньги: ");
        Float userSum = Float.parseFloat(myObj1.nextLine());
        if (userSum >= this.products.get(userChoise-1).getPrice()) {
            System.out.println("\n" + "Вы приобрели " + this.products.get(userChoise-1).getProduct());
            System.out.println("\n" + "Ваша сдача " + (userSum - this.products.get(userChoise-1).getPrice()));
        } else {
            System.out.println("\n" + "Вы внесли не достаточно денег.");
        }
        
        myObj1.close();
    }

}
