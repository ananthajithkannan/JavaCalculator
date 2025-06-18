import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a character to find its frequency: ");
        char ch = scanner.next().charAt(0);

        int frequency = findFrequency(str, ch);

        if (frequency > 0) {
            System.out.println("The character '" + ch + "' appears " + frequency + " times in the string.");
        } else {
            System.out.println("The character '" + ch + "' does not appear in the string.");
        }

        scanner.close();
    }

    public static int findFrequency(String str, char ch) {
        int frequency = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                frequency++;
            }
        }
        return frequency;
    }
}
