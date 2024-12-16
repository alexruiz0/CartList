public class Product implements CartItem{
    private String name;
    private double price;

    public Product(String n, double p){
        this.name = n;
        this.price = p;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name+";"+this.price;
    }
}
