class Product implements Comparable<Product> {

    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    Product(String productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    // @Override
    // public int compareTo(Product other) {
    //     return Double.compare(this.price, other.price);
    // }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    
    @Override
    public String toString() {
        return "Product ID: " + productId
                + ", Product Name: " + productName
                + ", Price: ₹" + price
                + ", Quantity: " + quantity
                + ", Category: " + category
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product product = (Product) obj;

        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}