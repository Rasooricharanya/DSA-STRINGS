public class rotate {
    public static String rotateString(String s, int d) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        // Optimize the number of rotations
        //d = d % n;

        // Perform rotation 'd' times
        for (int i = 0; i < d; i++) {
            char first = charArray[0];
            for (int j = 0; j < n - 1; j++) {
                charArray[j] = charArray[j + 1];
            }
            charArray[n - 1] = first;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "book";
        int d = 2;
        String rotation = rotateString(s, d);
        System.out.println(rotation);
    }
}
