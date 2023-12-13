package lab6;

public abstract class Flower extends Item{
    private int freshness;
    private int length;

    public Flower(int price, int freshness, int length) {
        super(price);
        this.freshness = freshness;
        this.length = length;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return String.format("%s{price=%d, freshness=%d, length=%d}", this.getClass().getSimpleName(), price,
                freshness, length);
    }
}
