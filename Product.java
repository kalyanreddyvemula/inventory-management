class Product implements Comparable<Product> {

    private String productId;
    private String productName;
    private double price;

    Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
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

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId
                + ", Product Name: " + productName
                + ", Price: ₹" + price;
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