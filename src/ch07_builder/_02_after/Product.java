package ch07_builder._02_after;

public class Product {

    private String name;

    private int stockCount;

    private int price;

    private int discountRate;

    private DiscountType discountType;

    public Product(String name, int price, int stockCount, int discountRate,
        DiscountType discountType) {
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
        this.discountRate = discountRate;
        this.discountType = discountType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }

    @Override
    public String toString() {
        return "Product{" +
            "name='" + name + '\'' +
            ", stockCount=" + stockCount +
            ", price=" + price +
            ", discountRate=" + discountRate +
            ", discountType=" + discountType +
            '}';
    }
}
