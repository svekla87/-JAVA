public class EvaluatingExpressions {
    public static void main(String[] args) {
        double x = 3 - ((56 - 12) / 44 * (4 / 2));
        double y = (2 * x) / (33 - x);
        double z = -x / (2 * y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
