package lab5;


public class Letter extends TextMember {
    private char symbol;

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return Character.toString(symbol);
    }
}
