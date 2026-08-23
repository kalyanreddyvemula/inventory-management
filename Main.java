
public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product laptop = new Product("P001", "Laptop", 80000, 10, "Electronics");
        Product kids = new Product("P005", "Kids Laptop", 150000000, 5, "Electronics");

        Product laptop2 = new Product("P004", "Gaming Laptop", 1000000, 3, "Electronics");
        Product laptop3 = new Product("P003", "work Laptop", 1200000, 1, "Electronics");
        Product smartphone = new Product("P002", "Smartphone", 30000, 0, "Electronics");

        Product bluetoothSpeaker = new Product("P006", "Bluetooth Speaker", 5000, 15, "Electronics");
        Product chair = new Product("P007", "WheelChair", 2000, 20, "Furniture");

        inventory.addProduct(laptop);
        inventory.addProduct(kids);
        inventory.addProduct(smartphone);
        inventory.addProduct(laptop2);
        inventory.addProduct(laptop3);
        inventory.addProduct(bluetoothSpeaker);
        inventory.addProduct(chair);

        inventory.findProductById("P001");
        inventory.findProductById("P003");

        inventory.displayAllProducts();

        System.out.println("Sorting products by name:");

        // inventory.sortByPriceAscending();
        // inventory.sortPriceByDescending();
        inventory.sortByProductName();

        inventory.getProductCount();

        inventory.calculateInventoryValue();

        inventory.expensiveProduct();

        inventory.cheapProduct();

        inventory.addQuantity("P001", 100);

        inventory.removeQuantity("P001", 50);

        String pId = "P003";

        System.out.println("Stock of " + pId + ": " + inventory.getStock(pId));

        inventory.displayLowStockProducts(5);

        System.out.println(
                "Total Stock Value: "
                + inventory.getTotalStockValue()
        );

        inventory.findProductsByCategory("Furniture");

        int electronicsCount
                = inventory.getProductCountByCategory("Electronics");

        System.out.println("Electronics products: " + electronicsCount);
    }
}
