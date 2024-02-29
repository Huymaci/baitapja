package hh;

public class Circle {
    private float radius;
    private String color;

    public Circle() {
    }
    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public float getP() {
        return 2 * 3.14f * radius;
    }

    public float getA() {
        return radius * 3.14f * radius;
    }

    public void getI4() {
        System.out.println(this.color + "," + this.radius);
    }
}
