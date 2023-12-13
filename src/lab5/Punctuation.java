package lab5;


public class Punctuation extends TextMember {
    private String symbol;

    public Punctuation(String symbol) {
        if (!symbol.matches("\\p{Punct}")) {
            throw new IllegalArgumentException("symbol should be punctuation");
        }
        this.symbol = symbol;
    }

    public String toString() {
        return symbol;
    }
}
