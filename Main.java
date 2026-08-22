
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product laptop = new Product("P001", "Laptop", 80000);
        Product smartphone = new Product("P002", "Smartphone", 30000);

        inventory.addProduct(laptop);
        inventory.addProduct(smartphone);

        inventory.findProductById("P001");
        inventory.findProductById("P003");

        inventory.removeProduct("P002");
        inventory.removeProduct("P003");

        inventory.displayAllProducts();

    }
}