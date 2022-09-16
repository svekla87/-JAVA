public class Palindrome3 {
    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < string.length() / 2 && j > 0; i++, j--) {
            while (i < string.length() - 1 && !Character.isLetter(string.charAt(i))) {
                i++;
            }

            while (j > 0 && !Character.isLetter(string.charAt(j))) {
                j--;
            }

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] strings = {"11е111 ", "", " абв ", "   jh", "__hj__jh", "   a", "apple", "111  ", "Аргентина манит негра", "ga  ll  agg", "g*ml_m4g", "ab///ba"};

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