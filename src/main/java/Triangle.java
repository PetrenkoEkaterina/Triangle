public class Triangle {
    public static void main(String[] args) {
        double sideA = 4.2;
        double sideB = 5.6;
        double sideC = 6.6;
        double P = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(P*(P-sideA)*(P-sideB)*(P-sideC));

        System.out.println("Площадь треугольника " + area);
    }
}
