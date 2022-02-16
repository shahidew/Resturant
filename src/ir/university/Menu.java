package ir.university;

public abstract class Menu {
    protected String code;
    protected String name;
    protected long price;
    protected int holding;

    public Menu() {
    }

    public Menu(String code, String name, long price, int holding) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.holding = holding;
    }

    protected double calculateTax() {
        return 0.0D;
    }

    protected double payment() {
        return 0.0D;
    }

    public String toString() {
        return super.toString();
    }
}
