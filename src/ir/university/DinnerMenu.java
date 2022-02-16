package ir.university;

public class DinnerMenu extends Menu {
    private Type type;

    public DinnerMenu() {
    }

    public DinnerMenu(String code, String name, long price, int holding, Type type) {
        super(code, name, price, holding);
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    protected double calculateTax() {
        return 0.15D * (double)this.price;
    }

    protected double payment() {
        return (double)this.price + this.calculateTax();
    }

    public String toString() {
        String var10000 = this.code;
        return var10000 + "  " + this.name + "  " + this.payment() + "T";
    }
}
