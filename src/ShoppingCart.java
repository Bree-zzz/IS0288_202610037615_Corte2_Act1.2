import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }
    public double calculateTotal(ShoppingCartVisitor visitor) {
        double sum = 0;
        for (Product product : products) {
            sum += product.accept(visitor);
        }
        return sum;
    }
}