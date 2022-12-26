package ch07_builder._02_after;

public class DefaultProductBuilder implements ProductBuilder {

    private String name;

    private int stockCount;

    private int price;

    private int discountRate;

    private DiscountType discountType;

    @Override
    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductBuilder price(int price) {
        this.price = price;
        return this;
    }

    @Override
    public ProductBuilder stockCount(int stockCount) {
        this.stockCount = stockCount;
        return this;
    }

    @Override
    public ProductBuilder discountRateAndDiscountType(int discountRate, DiscountType discountType) {
        this.discountRate = discountRate;
        this.discountType = discountType;
        return this;
    }

    @Override
    public Product build() {
        return new Product(name,price,stockCount, discountRate, discountType);
    }
}
