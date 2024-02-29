package hh;

public class Cylinder extends Circle {
    private float height;

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getV() {
        return getA() * height;
    }

    public float getS() {
        float baseA = (float) (Math.PI * getRadius() * getRadius());
        float Sxq = (float) (2 * Math.PI * getRadius() * getHeight());
        float totaS = 2 * baseA + Sxq;

        return totaS;
    }

    public void getI4() {
        System.out.println(this.getColor() + "," + this.height + "," + this.getRadius());
    }
}

