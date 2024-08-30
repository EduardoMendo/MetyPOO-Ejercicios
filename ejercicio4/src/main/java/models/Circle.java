package models;

public class Circle {

    private double radius;
    private double circunferencia;
    private double area;

    public Circle(){
    }

    public Circle(double radius, double circunferencia, double area){
        this.radius = radius;
        this.circunferencia = circunferencia;
        this.area = area;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircunferencia() {
        return circunferencia;
    }
}
