/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Zoe Sun
 */
public class Riddler {

    // Puzzle 1: Caesar Cipher
    public String decryptOne(String encrypted) {
        String decrypted = "";
        char base;
        // Iterate over entire string to decrypt
        for (int i = 0; i < encrypted.length(); i++) {
            // Only need to decrypt letters
            if (Character.isLetter(encrypted.charAt(i))) {
                char letter = encrypted.charAt(i);
                if (Character.isUpperCase(encrypted.charAt(i))) {
                    // base char is 'A' for uppercase letter
                    base = 'A';
                } else {
                    // base char is 'a' for lowercase letter
                    base = 'a';
                }
                // Calculate decrypted ascii value of encrypted letters
                int relativePosition =  (int) letter - (int) base; // Dist of encrypted letter from base
                int shift = 9; // Shift by 9 to decrypt
                int shiftedRelativePosition = (relativePosition + shift) % 26; // Dist including shift and wraparound
                char shiftedChar = (char) (base + shiftedRelativePosition); // Convert ascii value back to char
                decrypted += shiftedChar;
            } else {
                // Non-letter characters stay the same
                decrypted += encrypted.charAt(i);
            }
        }
        return decrypted;
    }

    // Puzzle 2: Ascii values
    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Convert numbers from string into ints
        String[] splits = encrypted.split(" ");
        int[] nums = new int[splits.length];
        // Parse integers from string
        for (int i = 0; i < splits.length; i++) {
            nums[i] = Integer.parseInt(splits[i]);
        }
        // Convert integers from ascii value to char
        for (int i = 0; i < nums.length; i++) {
            char letter = (char) nums[i];
            decrypted += letter;
        }
        return decrypted;
    }

    // Puzzle 3: Binary 8-bit int
    public String decryptThree(String encrypted) {
        String decrypted = "";
        // Iterate over each 8  bit binary sequence
        for (int i = 0; i < encrypted.length(); i+=8) {
            String bytes = encrypted.substring(i, i + 8);
            // Convert from binary int to character
            char letter = (char) Integer.parseInt(bytes, 2);
            decrypted += letter;
        }
        return decrypted;
    }

    // Puzzle 4: Dingbat unicode
    public String decryptFour(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < decrypted.length(); i++) {
            // Get the numerical value of the dingbat character
            int dingbat = decrypted.charAt(i);
            // Convert from unicode to ascii
            int ascii = dingbat - 0x2700 + 45;
            // Convert to character
            char letter = (char) ascii;
            decrypted += letter;
        }
        return decrypted;
    }
}

