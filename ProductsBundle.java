import java.util.ArrayList;

public class ProductsBundle implements CartItem{
    private ArrayList<CartItem> items;
    private double count;

    public ProductsBundle(){
        this.items = new ArrayList<CartItem>();
        this.count = 0;
    }

    @Override
    public double getPrice() {
        double t = 0;
        for(int i=0;i<items.size();++i){
            t+=items.get(i).getPrice();
        }
        return t;
    }

    public void addProduct(CartItem i){
        this.items.add(i);
        this.count++;
    }

    public String toString(){
        String exit = "(";
        for(int i=0;i<items.size();++i){
            exit+=items.get(i).toString();
            if(items.get(i) == items.getLast()){
                break;
            }
            exit+=",";
        }
        exit += ")";
        return exit+";"+this.getPrice();
    }
}
