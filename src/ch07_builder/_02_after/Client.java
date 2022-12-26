package ch07_builder._02_after;

public class Client {

    public static void main(String[] args) {
        ProductBuilder builder = new DefaultProductBuilder();
        Product product = builder.name("장난감").price(10000)
            .discountRateAndDiscountType(10, DiscountType.PERCENTAGE)
            .stockCount(100).build();

        System.out.println(product.toString());
    }

}
