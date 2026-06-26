class DiscountCalculator implements ShoppingCartVisitor {
    @Override
    public double visit(Book book) {
        double discount = book.getPrice() > 50 ? 10 : 5;
        double finalPrice = book.getPrice() - discount;
        System.out.println("Book: " + book.getTitle() + " final price: " + finalPrice);
        return finalPrice;
    }

@Override
    public double visit(Electronic electronic) {
        double discount = electronic.getPrice() * 0.1;
        double finalPrice = electronic.getPrice() - discount;
        System.out.println("Electronic Item: " + electronic.getName() + " final price: " + finalPrice);
        return finalPrice;
    }
}