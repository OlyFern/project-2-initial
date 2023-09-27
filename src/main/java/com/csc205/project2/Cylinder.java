package com.csc205.project2;

public class Cylinder extends Shape{
    private double height;
    private double radius;
    public Cylinder(){

    }
    public Cylinder(double h, double r){
        this.height = h;
        this.radius = r;
    }
    public double getHeight(){
        return this.height;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setHeight(double h){
        this.height = h;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double surfaceArea(){
        return (2.0 * Math.PI * this.radius * this.height + 2.0 * Math.PI * Math.pow(this.radius, 2));
    }
    public double volume(){
        return (Math.PI * Math.pow(this.radius, 2) * this.height);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
