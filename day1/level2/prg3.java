class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor to initialize the text attribute
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

// Main class
public class prg3 {
    public static void main(String[] args) {
        // Creating a PalindromeChecker object
        PalindromeChecker checker1 = new PalindromeChecker("A man, a plan, a canal, Panama");
        PalindromeChecker checker2 = new PalindromeChecker("Hello, World!");

        // Displaying results
        checker1.displayResult();
        checker2.displayResult();
    }
}