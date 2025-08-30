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
            // Only decrypt letters
            if (Character.isLetter(encrypted.charAt(i))) {
                char letter = encrypted.charAt(i);
                // Adjust base char for upper/lowercase 'a'/'A'
                if (Character.isUpperCase(encrypted.charAt(i))) {
                    base = 'A';
                } else {
                    base = 'a';
                }
                // Shift by 9 to decrypt
                int shift = 9;
                // Calculate decrypted ascii value of encrypted letters
                char shiftedChar = (char) ((letter - base + shift) % 26 + base);
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
        // Parse numbers from string and store in int array
        String[] splits = encrypted.split(" ");
        int[] nums = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            nums[i] = Integer.parseInt(splits[i]);
        }
        // Convert integers from ascii value to char
        for (int i = 0; i < nums.length; i++) {
            char decoded = (char) nums[i];
            decrypted += decoded;
        }
        return decrypted;
    }

    // Puzzle 3: Binary 8-bit int
    public String decryptThree(String encrypted) {
        String decrypted = "";
        // Iterate over each 8-bit binary sequence
        for (int i = 0; i < encrypted.length(); i+=8) {
            String bytes = encrypted.substring(i, i + 8);
            // Convert from binary int to base 10 ascii value
            int ascii = Integer.parseInt(bytes, 2);
            // Convert ascii value to character
            char decoded = (char) ascii;
            decrypted += decoded;
        }
        return decrypted;
    }

    // Puzzle 4: Dingbat unicode
    public String decryptFour(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < decrypted.length(); i++) {
            // Get the numerical value of the dingbat character
            int dingbat = decrypted.charAt(i);
            // Convert from dingbat hex to ascii values
            int ascii = dingbat - 0x2700 + 45;
            // Convert ascii value to character
            char decoded = (char) ascii;
            decrypted += decoded;
        }
        return decrypted;
    }
}

