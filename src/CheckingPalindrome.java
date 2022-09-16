import java.util.Scanner;

public class CheckingPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для проверки:");
        String string = scanner.nextLine();

        if (isPalindrome(string)) {
            System.out.println("Введенная строка является палиндромом!");
        } else {
            System.out.println("Вы ввели не палиндром!");
        }
    }

    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            while (i < string.length() - 1 && !Character.isLetter(string.charAt(i))) {
                i++;
            }

            while (j > 0 && !Character.isLetter(string.charAt(j))) {
                j--;
            }

            if (string.charAt(i) != string.charAt(j) && Character.isLetter(string.charAt(i)) && Character.isLetter(string.charAt(j))) {
                return false;
            }
        }

        return true;
    }
}