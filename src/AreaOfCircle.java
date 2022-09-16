public class AreaOfCircle {
    public static void main(String[] args) {
        int radius = 3;
        double a = Math.pow(radius, 2);
        double area = Math.PI * a;
        System.out.println("Площадь круга равна: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Длина окружности равна: " + circumference);
    }
}
