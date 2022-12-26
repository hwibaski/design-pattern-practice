package ch07_builder._01_before;

public class Client {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("장난감");
        product.setDiscountType(DiscountType.PERCENTAGE);
        product.setPrice(10000);
        product.setStockCount(100);
        product.setDiscountRate(10);
        System.out.println(product);
    }

}
