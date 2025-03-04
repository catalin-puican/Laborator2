package ro.ulbs.paradigme.lab2;

public class Form {

    private String color;
    private float area;

    Form(){
        this.color = "white";
    }

    Form(String color){
        this.color = color;
    }
    public float getArea(){

        return area=0;
    }

    @Override
    public String toString() {

        this.color = color;
        System.out.println("This form has the color "+color);

        return super.toString();

    }
}
