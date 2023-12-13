package lab3;

public class Main {
    public static void main(String[] args) {
        /*
        1222

        StringBuffer
        Замінити слова заданої довжини визначеним рядком
         */

        StringBuffer string = new StringBuffer("Let's Easy come, (*^&*%<,,,.d) easy go, little high, little low");
        StringBuffer replacement = new StringBuffer("88");
        int length = 5;

        System.out.println(replace(string, length, replacement));
        System.out.println(replaceBuffer(string, length, replacement));
    }

    /**
     * Replace words of a given length with a string
     * @param inputString input text
     * @param targetLength length of the words to be replaced
     * @param replacement string to be used for replacement
     * @return replaced text
     */
    public static StringBuffer replace(StringBuffer inputString, int targetLength, StringBuffer replacement) {
        StringBuffer result = new StringBuffer();
        String[] words = inputString.toString().split("\\s");

        for(int i = 0; i < words.length; i++) {
            result.append((words[i].length() == targetLength ? replacement : words[i]));
//            if (words[i].length() == targetLength) {
//                result.append(replacement);
//            } else {
//                result.append(words[i]);
//            }
            if (i < words.length - 1) result.append(" ");
//            if (i < words.length - 1) {
//                result.append(" ");
//            }
        }
        return result;
    }

    /**
     * Replace words of a given length with a string
     * @param inputString input text
     * @param targetLength length of the words to be replaced
     * @param replacement string to be used for replacement
     * @return replaced text
     */
    public static StringBuffer replaceBuffer(StringBuffer inputString, int targetLength, StringBuffer replacement) {
        int length = inputString.length();
        int wordStart = 0;

        for (int i = 0; i < length; i++) {
            char curr = inputString.charAt(i);

            // if space or last char
            if (Character.isWhitespace(curr) || i == length - 1) {
                int wordEnd = (i == length - 1) ? i + 1 : i;

                if (wordEnd - wordStart == targetLength) {
                    inputString.replace(wordStart, wordEnd, replacement.toString());
                    // jump over inserted word
                    i = wordStart + replacement.length();
                    length = inputString.length();
                }
                wordStart = i + 1;
            }
        }
        return inputString;
    }
}
