public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println("Product Added!");
    }

    public void Add2(int id, String name, String description, double price, int stockAmount) {
        // Bu yanlışdır, yeni attribute elave edən zaman problem yaranacag
    }
}
