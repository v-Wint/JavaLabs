package lab6;

public abstract class Accessory extends Item {
    public Accessory(int price) {
        super(price);
    }

    public String toString() {
        return String.format("%s{price=%d}", this.getClass().getSimpleName(), price);
    }
}
