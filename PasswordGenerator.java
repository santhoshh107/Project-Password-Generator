import java.util.Random;
import java.util.Scanner;

// 1. CLASS
class PasswordGenerator {

    // 2. ARRAYS (Character pool stored in a String array)
    String[] pool = {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "!", "@", "#", "$", "%", "&", "*"
    };

    int passwordLength;

    // 3. CONSTRUCTOR
    public PasswordGenerator(int length) {
        this.passwordLength = length;
    }

    // 4. METHOD
    public String generate() {
        Random random = new Random();
        String resultPassword = ""; // STRINGS

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(pool.length);
            resultPassword += pool[randomIndex];
        }

        return resultPassword;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userLength = 0;

        // VALIDATION LOOP (Ensures length is strictly greater than 0)
        while (userLength <= 0) {
            System.out.print("Enter password length (must be > 0): ");
            userLength = input.nextInt();

            if (userLength <= 0) {
                System.out.println("Invalid length! Password length must be at least 1.\n");
            }
        }

        // 5. OBJECT CREATION
        PasswordGenerator myGenerator = new PasswordGenerator(userLength);

        // Call method on object
        String password = myGenerator.generate();

        System.out.println("Generated Password: " + password);

        input.close();
    }
}
