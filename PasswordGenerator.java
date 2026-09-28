import java.util.Random;
import java.util.Scanner; // Import Scanner class for user input

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

    // 3. CONSTRUCTOR (Sets length passed from main)
    public PasswordGenerator(int length) {
        this.passwordLength = length;
    }

    // 4. METHOD (Generates and returns the password String)
    public String generate() {
        Random random = new Random();
        String resultPassword = ""; // STRINGS

        // Loop to pick random elements from array
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(pool.length);
            resultPassword += pool[randomIndex];
        }

        return resultPassword;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int userLength = input.nextInt(); // Read integer from user

        // 5. OBJECT CREATION (Passing user input into constructor)
        PasswordGenerator myGenerator = new PasswordGenerator(userLength);

        // Call method on object
        String password = myGenerator.generate();

        System.out.println("Generated Password: " + password);

        input.close(); // Close scanner
    }
}