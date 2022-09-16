import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку, в которой будут буквы, цифры, пробелы, символы:");
        String string = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int otherCharactersCount = 0;

        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);

            if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isDigit(c)) {
                digitsCount++;
            } else if (Character.isWhitespace(c)) {
                whitespacesCount++;
            } else {
                otherCharactersCount++;
            }
        }

        System.out.println("Число букв в введенной строке \"" + string + "\" = " + lettersCount);
        System.out.println("Число цифр в введенной строке \"" + string + "\" = " + digitsCount);
        System.out.println("Число пробелов в введенной строке \"" + string + "\" = " + whitespacesCount);
        System.out.println("Число других символов в введенной строке \"" + string + "\" = " + otherCharactersCount);
    }
}