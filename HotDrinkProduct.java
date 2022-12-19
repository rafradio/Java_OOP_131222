public class HotDrinkProduct extends Product {
    private float temperature;
    // private String name;
    public String nameCopy;
    // private float price;
    // private String type;

    public HotDrinkProduct(String name, float price, String type, float volume, float temperature) {
        super(name, price, type, volume);
        this.temperature = temperature;
        // this.nameCopy = this.name;
        // System.out.println(this.nameCopy);
    }

    // через геттер дочерний не дает добраться
    // @Override
    // public String getName() {
    //     return "Горячий напиток " + this.name;
    // }

    // @Override
    // public float getPrice() {
    //     return this.price;
    // }

    

    // через геттер родительский добрался
    @Override
    public String getType() {
        return "Горячий напиток " + this.getName() + " температурой " + this.temperature;
    }

    public float getTemperature() {
        return this.temperature;
    }

    // @Override
    // public String toString() {
    //     return this.getName() + " " + this.getVolume() + " " + this.getTemperature();
    // }

    @Override
    public String getProduct() {
        return "Продукт " + this.toString() + " температурой " + this.getTemperature();
    }
    
}
