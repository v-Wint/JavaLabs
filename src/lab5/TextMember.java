package lab5;


abstract class TextMember {
    public abstract String toString();

    int length() {
        return this.toString().length();
    }
}
