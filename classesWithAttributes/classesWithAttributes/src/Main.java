public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Notebook", "Asus Notebook", 5000, 3, "black");
        /*product.setName("Notebook");
        product.setId(1);
        product.setDescription("Asus Notebook");
        product.setPrice(5000);
        product.setStockAmount(3);*/
        System.out.println(product.getId());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}