package strings;

public class Challenge1 {

    public static void main(String[] args) {
        String name = "Ruslan";
        String sentence1 = "Hello World, my first candidate for reversion";
        String sentence2 = "what can I do today";

        System.out.println(reverseWord(name));
        System.out.println(reverseSentence(sentence1));
        System.out.println(reverseSentence(sentence2));
    }


    public static String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }

    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        if (sentence.equals(" ")) return " ";
        StringBuilder returnValue = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            returnValue.append(reverseWord(word)).append(" ");
        }
        return returnValue.toString().trim();
    }
}
