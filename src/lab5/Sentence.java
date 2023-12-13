package lab5;


public class Sentence extends TextMember {
    private TextMember[] members;

    public Sentence(String sentence) {
        // spaces or punctuation before or punctuation after
        String[] members = sentence.split("\s+|(?<=[\\p{Punct}&&[^-']])|(?=[\\p{Punct}&&[^-']])");
        this.members = new TextMember[members.length];

        for (int i = 0; i < members.length; i++) {
            this.members[i] = members[i].matches("\\p{Punct}") ? new Punctuation(members[i]) : new Word(members[i].trim());
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < members.length; i++) {
            result.append(members[i]);
            // якщо не останній в реченні і наступний є словом і поточний не є відкриваючою дужкою
            if (i < members.length - 1 && members[i+1] instanceof Word && !members[i].toString().equals("(")) {
                result.append(' ');
            }
        }
        result.append(' ');

        return result.toString();
    }

    public void replaceWordsSetLength(int length, String replacement) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] instanceof Word && members[i].length() == length) {
                members[i] = new Word(replacement);
            }
        }
    }
}
