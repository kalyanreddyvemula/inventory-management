import java.util.HashMap;
import java.util.Map;

class Inventory{

    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }

    public void findProductById(String productId) {
        if(products.containsKey(productId)) {
           Product product = products.get(productId);
           System.out.println("Product found: " + product);
        }else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }


    public void removeProduct(String productId) {
        if(products.containsKey(productId)){
            products.remove(productId);
            System.out.println("Product with Id: " + productId + " removed successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void displayAllProducts() {
        if(products.isEmpty()){
            System.out.println("No products available in the Inventory.");
        }else{
            System.out.println("All Products in Inventory:");
            for (Product product : products.values()) {
    System.out.println(product);
}
        }
    }

}