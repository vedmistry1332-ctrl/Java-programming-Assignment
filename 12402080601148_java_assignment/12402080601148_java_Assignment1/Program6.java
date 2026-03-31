//Problem Statement:
//Implement a Cipher system using an abstract class and method overriding to perform encryption and decryption of text.
import java.util.Scanner;
abstract class Cipher {

    abstract String encrypt(String text, int key);

    abstract String decrypt(String text, int key);
}

class CaesarCipher extends Cipher {

    String encrypt(String text, int key) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {

                char base = Character.isUpperCase(ch) ? 'A' : 'a';

                ch = (char) ((ch - base + key) % 26 + base);
            }

            result += ch;
        }

        return result;
    }

    String decrypt(String text, int key) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {

                char base = Character.isUpperCase(ch) ? 'A' : 'a';

                ch = (char) ((ch - base - key + 26) % 26 + base);
            }

            result += ch;
        }

        return result;
    }
}

public class Program6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CaesarCipher cipher = new CaesarCipher();

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter key value: ");
        int key = sc.nextInt();

        String encrypted = cipher.encrypt(text, key);
        System.out.println("Encrypted Text: " + encrypted);

        String decrypted = cipher.decrypt(encrypted, key);
        System.out.println("Decrypted Text: " + decrypted);

        sc.close();
    }
}