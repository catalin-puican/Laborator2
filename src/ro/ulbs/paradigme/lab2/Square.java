package ro.ulbs.paradigme.lab2;

public class Square extends Form {

private float side;


Square(){}

    Square(float side){
    this.side = side;
    }

    public Square(float v, String blue) {
    this.side = v;
    }

    @Override
    public float getArea() {
    float area=side*side;
        return area;
    }

    @Override
    public String toString() {
        return "This form has the side "+side;
    }
}
