package FGFCoding;

public class PrintFirstLetterOfWord {
    public static void main(String[] args) {
        String S = "geeks for geeks";
        String[] words = S.split(" "); // Split the string into words using whitespace as delimiter
        String res = "";
        for (String word : words) {
            res += word.charAt(0); // Append the first character of each word
        }
        System.out.println(res);
    }
}
