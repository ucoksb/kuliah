package Minggu3.AbstraksiContoh2;

public abstract class Shape {
    String color;
    
    void setColor(String color){
        this.color = color;
    }
    String getCotor(){
        return this.color;
    }
    abstract float getArea();
}