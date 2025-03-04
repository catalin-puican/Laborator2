package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {


private float height;

private float base;

Triangle(){}

    Triangle(float height , float base){

    this.height = height;
    this.base = base;
    }

    public Triangle(float v, float v1, String red) {
    this.height = v;
    this.base = v1;
    }

    @Override
    public float getArea() {

    float area = base*height/2;

        return area;
    }

    @Override
    public String toString() {

        return "This form has height " + height + " and base " + base;
    }
    void equals(){}
}
