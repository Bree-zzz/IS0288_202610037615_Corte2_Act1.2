class Electronic implements Product {
    private String name;
    private double price;

public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}