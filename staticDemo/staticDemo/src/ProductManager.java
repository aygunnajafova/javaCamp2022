public class ProductManager {
    public void Add(Product product) {
        if(ProductValidator.isValid(product)) {
            System.out.println("Added");
        } else {
            System.out.println("Didn't Add");
        }
    }
}
