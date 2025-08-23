/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Zoe Sun
 */
public class Riddler {

    public String decryptOne(String encrypted) { // TODO: test
        String decrypted = ""; // Initialize empty string for decrypted string
        char base; // Initialize base (depends on if upper/lowercase letter)

        // Iterate over entire string to decrypt
        for (int i = 0; i < encrypted.length(); i++) {
            // Only need to decrypt letters
            if (Character.isLetter(encrypted.charAt(i))) {
                char letter = encrypted.charAt(i);
                if (Character.isUpperCase(encrypted.charAt(i))) {
                    base = 'A'; // base char is 'A' for uppercase letter
                } else {
                    base = 'a'; // base char is 'a' for lowercase letter
                }

                // Calculate decrypted ascii value of encrypted letters
                int relativePosition =  (int) letter - (int) base; // Dist of encrypted letter from 'a' or 'A'
                int shift = 9; // Shift by 9 to decrypt
                int shiftedRelativePosition = (relativePosition + shift) % 26; // Distance of decrypted letter from 'a' or 'A' with wraparound
                char shiftedChar = (char) (base + shiftedRelativePosition); // Convert ascii value back to char
                decrypted = decrypted + shiftedChar;
            } else { // Non-letter characters stay the same
                decrypted = decrypted + encrypted.charAt(i);
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {

        }

        // TODO: Complete the decryptTwo() function.

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}

