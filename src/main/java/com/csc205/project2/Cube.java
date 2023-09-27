package com.csc205.project2;

public class Cube extends Shape{
    private double width;
    public Cube(){

    }
    public Cube(double v){
        this.width = v;

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double surfaceArea(){
        return (Math.pow(this.width, 2)) * 6.0;
    }

    public double volume(){
        return (Math.pow(this.width, 3));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

}
