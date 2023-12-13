package lab5;


public class Text extends TextMember {
    private Sentence[] sentences;


    public Text(String text) {
        String[] sentences = text.split("(?<=[.?!]\\s)");
        this.sentences = new Sentence[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            this.sentences[i] = new Sentence(sentences[i].trim());
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence);
        }
        return result.toString().trim();
    }

    public void replaceWordsSetLength(int length, String replacement) {
        for (Sentence sentence : sentences) {
            sentence.replaceWordsSetLength(length, replacement);
        }
    }
}
