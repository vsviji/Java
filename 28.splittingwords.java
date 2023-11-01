public class WordSplitter {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence without built-in functions";
        StringBuilder currentWord = new StringBuilder();
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            
            // Check if the character is a space or a delimiter
            if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                if (currentWord.length() > 0) {
                    System.out.println(currentWord.toString());
                    currentWord.setLength(0); // Reset the currentWord
                }
            } else {
                currentWord.append(c); // Add the character to the current word
            }
        }
        
        // Print the last word if there's one remaining
        if (currentWord.length() > 0) {
            System.out.println(currentWord.toString());
        }
    }
}
