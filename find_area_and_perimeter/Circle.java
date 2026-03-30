public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }
    public Circle(double new_radius) {
        radius = new_radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public void setRadius(double new_radius) {
        radius = new_radius;
    }

}
