public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Book("Design Patterns", 60));
        cart.addProduct(new Electronic("Laptop", 800));
        cart.addProduct(new Book("Clean Code", 40));
        
        ShoppingCartVisitor discountCalculator = new DiscountCalculator();
        double totalPrice = cart.calculateTotal(discountCalculator);
        
        System.out.println("Total Cart Price after Discount: " + totalPrice);
    }
}