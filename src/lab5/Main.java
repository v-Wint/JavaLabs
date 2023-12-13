package lab5;


public class Main {
    public static void main(String[] args) {
        String stringText = "Hello! How are    \tyou today? I hope you're doing well. This is an example text with commas, semicolons, and colons; it also includes parentheses (both open and close), dashes – both en-dashes and em-dashes – and some ellipses...";
        System.out.println(stringText);
        Text text = new Text(stringText);
        System.out.println(text);
        text.replaceWordsSetLength(4, "8888");
        System.out.println(text);
    }
}
