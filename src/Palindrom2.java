public class Palindrom2 {
    private static boolean isPalindrome(String string) {
        if (!isHaveCharacter(string)) {
            return false;
        }

        int lineLength = string.length();
        int i, j;

        for (i = 0, j = lineLength - 1; i < lineLength / 2; i++, j--) {
            char character1 = string.charAt(i);
            char character2 = string.charAt(j);

            if (!Character.isLetter(character1)) {
                character1 = string.charAt(i + 1);
                i++;
            }

            if (!Character.isLetter(character2)) {
                character2 = string.charAt(j - 1);
                j--;
            }

            if (Character.toLowerCase(character1) != Character.toLowerCase(character2)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isHaveCharacter(String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetter(s.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] strings = {"11е111 ", "", "   jh","__mj__jm", "   a", "apple", "111  ", "Аргентина манит негра", "ga  ll  agg", "g*ml_m4g", "ab///ba"};

        for (String s : strings) {
            System.out.print("Строка: " + s + "\t\t\t");
            if (isPalindrome(s)) {
                System.out.print("Это палиндром!");
            } else {
                System.out.print("Это не палиндром!");
            }

            System.out.println();
        }
    }
}