public class Main {
    public static void main(String[] args) {

        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(5);
        Circle thirdCircle = new Circle(125);

        System.out.println("First Circle:");
        System.out.printf("Area: %.2f \n", firstCircle.getArea());
        System.out.printf("Perimeter: %.2f \n", firstCircle.getPerimeter());

        System.out.println("\nSecond Circle:");
        System.out.printf("Area: %.2f \n", secondCircle.getArea());
        System.out.printf("Perimeter: %.2f \n", secondCircle.getPerimeter());

        System.out.println("\nThird Circle:");
        System.out.printf("Area: %.2f \n", thirdCircle.getArea());
        System.out.printf("Perimeter: %.2f \n", thirdCircle.getPerimeter());
    }
}