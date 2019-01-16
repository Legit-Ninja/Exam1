

public class Triangle implements Shape {
    private int side1;              //data fields for a circle object
    private int side2;
    private int side3;
    private String cColor;
    private int ID;

   Triangle() { side1 = 0; side2 = 0; side3 = 0; cColor = "wihte";}
    Triangle(String ID_, String s, String s2, String s3, String c ) {
        side1 = Integer.parseInt(s);
        side2 = Integer.parseInt(s2);
        side3 = Integer.parseInt(s3);
        cColor = c;       //uses function of library "AWT color Factory" https://github.com/beryx/awt-color-factory/blob/master/README.md
        ID = Integer.parseInt(ID_);
    }
    public int getArea() {
        return side1 * side2;
    }
    // get functions and constructors
    public String ColorgetcColor() { return cColor; }
    //implementing the Shape interface functions:
    public int getID() {
        return ID;
    }

    public String getcColor() { return cColor; }
    public String toString() { return ("Triangle #"+ ID); }
    public String getKind()  {return "triangle";}
    public String getDetailString()
    {
        double perimeter = side1 + side2 + side3;
        return "shape: Triangle, Color: " + getcColor() + " Area: " + getArea() +
                "perimeter " + perimeter;
    }
}
