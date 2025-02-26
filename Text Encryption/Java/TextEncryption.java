import java.util.Scanner;

public class TextEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int jump = sc.nextInt();
            if (jump == 0) { return; }
            sc.nextLine();
            String message = sc.nextLine();
            message = message.toUpperCase();
            message = message.replace(" ", "");
            if (message.length()<jump) { System.out.println(message); } else {
                char[] messageChar = message.toCharArray();
                char[] encrypted = message.toCharArray();
                int index = 0;
                int start = 0;
                for (int i = 0; i<message.length();i++) {
                    char enc = messageChar[i];
                    encrypted[index] = enc;
                    index += jump;
                    if (index >= messageChar.length) {
                        start++;
                        index = start;
                    }
                }
                System.out.println(encrypted);
                /*if (canDecrypt(messageChar, encrypted, jump)) {
                    System.out.println(encrypted);
                } else {
                    System.out.println(messageChar);
                }*/
            }
        }
    }

    private static boolean canDecrypt(char[] messageChar, char[] encrypted, int jump) {
        int index = 0;
        for (char c : messageChar) {
            index = (index + jump) % messageChar.length;
            if (encrypted[index] != c) {
                return false;
            }
        }
        return true;
    }
}
