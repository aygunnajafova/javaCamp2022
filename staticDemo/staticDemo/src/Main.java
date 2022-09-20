public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "mouse";
        product.price = 20;
        productManager.Add(product);

        DatabaseHelper.Crud.Update();
    }
}