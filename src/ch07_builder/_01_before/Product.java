package ch07_builder._01_before;

public class Product {
    private String name;

    private int stockCount;

    private int price;

    private int discountRate;

    private DiscountType discountType;

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
