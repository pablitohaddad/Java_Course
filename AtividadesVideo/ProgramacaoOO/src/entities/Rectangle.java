package entities;

public class Rectangle {

    public Double width;
    public Double heigh;

    public double area(){
        return Double.parseDouble(String.format("%.2f", (width * heigh))); // Pode se usar 2 entidades
    }
    public double perimeter(){
        return Double.parseDouble(String.format("%.2f", (width * 2 + heigh * 2)));
    }
    public double diagonal(){
        double x = Math.pow(width, 2) + Math.pow(heigh, 2);
        return Double.parseDouble(String.format("%.2f",Math.sqrt(x)));
    }

}
