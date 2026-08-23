
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Inventory {

    private Map<String, Product> products = new HashMap<>();

    public void getProductCount() {
        System.out.println("Total number of products in the inventory: " + products.size());
    }

    public void expensiveProduct() {

        if (products.isEmpty()) {
            System.out.println("No products available in the inventory.");
            return;
        }

        Product expensiveProduct = Collections.max(products.values(), (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Most expensive product: " + expensiveProduct);
    }

    public void calculateInventoryValue() {
        int inventoryValue = 0;
        for (Product product : products.values()) {
            inventoryValue += product.getPrice();
        }

        System.out.println("Total inventory value: ₹" + inventoryValue);
    }

    public void sortByPriceAscending() {
        List<Product> productList = new ArrayList<>(products.values());
        Collections.sort(productList);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void sortByProductName() {
        List<Product> productList = new ArrayList<>(products.values());
        Collections.sort(productList, (p1, p2) -> p1.getProductName().compareTo(p2.getProductName()));
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void sortPriceByDescending() {
        List<Product> productList = new ArrayList<>(products.values());
        Collections.sort(productList, Collections.reverseOrder());

        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }

    public void findProductById(String productId) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            System.out.println("Product found: " + product);
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void removeProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product with Id: " + productId + " removed successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available in the Inventory.");
        } else {
            System.out.println("All Products in Inventory:");
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }

    public void updateProduct(String productId, String newProductName, double newPrice) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.setProductName(newProductName);
            product.setPrice(newPrice);
            System.out.println("Product with ID " + productId + " updated successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");

        }
    }

    public void searchProductsByName(String name) {

        boolean found = false;

        for (Product product : products.values()) {

            if (product.getProductName().toLowerCase().contains(name.toLowerCase())) {

                System.out.println("Product Details: " + product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found with name: " + name);
        }
    }

    public void cheapProduct() {

        if(products.isEmpty())
        {
            System.out.println("No products available in the inventory.");
            return;
        }

        Product cheapProduct = Collections.min(products.values(), (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Cheapest product: " + cheapProduct);
    }
}
