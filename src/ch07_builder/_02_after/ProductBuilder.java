package ch07_builder._02_after;

public interface ProductBuilder {
    ProductBuilder name(String name);

    ProductBuilder price(int price);

    ProductBuilder stockCount(int stockCount);

    ProductBuilder discountRateAndDiscountType(int discountRate, DiscountType discountType);

    Product build();
}
