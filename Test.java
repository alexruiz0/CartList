public class Test{
    public static void main(String[] args) {
        Product l = new Product("Laptop", 1200);
        Product m = new Product("Mouse", 40);

        ProductsBundle p = new ProductsBundle();
        p.addProduct(l);
        p.addProduct(m);
        
        System.out.println(p.toString());

    }
}