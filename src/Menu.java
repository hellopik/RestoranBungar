public class Menu {
    private String name;
    private Double price;
    private int quantity;

    Menu(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
