public class CaesarEncryption {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);
            if (Character.isLetter(currentChar)) {
                char encryptedChar = (char) ((currentChar - 'A' + shift) % 26 + 'A');
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(currentChar);
            }
        }
        return ciphertext.toString();
    }

    public static void main(String[] args) {
        String plaintext = "HELLO";
        int shift = 3;
        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}
