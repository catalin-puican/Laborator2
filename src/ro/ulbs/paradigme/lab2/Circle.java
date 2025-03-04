package ro.ulbs.paradigme.lab2;

public class Circle extends Form {


    private float radius;


    Circle() {
    }

    Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float v, String yellow) {
        this.radius = v;
    }

    @Override
    public float getArea() {
        float area = (float) (Math.PI * (radius * radius));
        return area;
    }

    @Override
    public String toString() {
        return "This form has the radius "+radius;
    }
}
