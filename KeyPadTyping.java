package FGFCoding;

public class KeyPadTyping {
    private static int KeyPad(char ch) {
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        input=input.toUpperCase();
        StringBuffer sb = new StringBuffer();
        for (char ch : input.toCharArray()) {
            int val = KeyPad(ch);
            if (val != -1) {
                sb.append(val);
            }
        }
        System.out.println(sb);
    }
}
