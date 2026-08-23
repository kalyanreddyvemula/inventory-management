
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();


        Product laptop = new Product("P001", "Laptop", 80000);

        Product laptop2 = new Product("P004", "Gaming Laptop", 1000000);
        Product laptop3 = new Product("P003", "work Laptop", 80000);
        Product smartphone = new Product("P002", "Smartphone", 30000);

        inventory.addProduct(laptop);
        inventory.addProduct(smartphone);
        inventory.addProduct(laptop2);
        inventory.addProduct(laptop3);

        inventory.findProductById("P001");
        inventory.findProductById("P003");


        inventory.displayAllProducts();


        inventory.searchProductsByName("Laptop");

    }
}