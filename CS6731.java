import java.util.Scanner;

    public class CS6731 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;

            while (true) {
                System.out.print("Enter a string (or 'q' to quit): ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    break;
                }

                if (isPalindrome(input)) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is not a palindrome.");
                }
            }

            scanner.close();
        }

        private static boolean isPalindrome(String str) {
            str = str.toLowerCase().replaceAll("\\s", "");
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }

