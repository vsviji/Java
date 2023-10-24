public class PatternPrinter {
    public static void printPattern(int height, int width, char pattern) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        int width = 10;
        char pattern = '*';

        printPattern(height, width, pattern);
    }
}
