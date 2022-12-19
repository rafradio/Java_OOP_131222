public class Product {
    private String name;
    private float price;
    private String type;
    private float volume;

    public Product(String name, float price, String type, float volume) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }

    public float getVolume() {
        return this.volume;
    }

    public String toString() {
        return this.getName() + " объем " + this.getVolume();
    }

    public String getProduct() {
        return "Продукт " + this.toString();
    }



}
