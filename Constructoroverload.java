/* Define a class box with data members: width, height and length and define three overloaded constructions to:

i) Pass values for all 3 members

ii) Initialize all members to - 1 iii) Assign same value to all three. */

public class Box {
    private double width;
    private double height;
    private double length;

    // Constructor 1: Pass values for all 3 members
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Constructor 2: Initialize all members to -1
    public Box() {
        this.width = -1;
        this.height = -1;
        this.length = -1;
    }

    // Constructor 3: Assign same value to all three
    public Box(double sameValue) {
        this.width = sameValue;
        this.height = sameValue;
        this.length = sameValue;
    }

    // Getters and setters for the data members
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
//Add main method 
