

public class Square implements Shape {
    private int side1;              //data fields for a circle object
    private String cColor;
    private int ID;

    Square() { side1 = 0; cColor = "white";}
    Square(String ID_, String s, String c ) {
        side1 = Integer.parseInt(s);
        cColor = c;          //uses function of library "AWT color Factory" https://github.com/beryx/awt-color-factory/blob/master/README.md
        ID = Integer.parseInt(ID_);
    }
    public int getArea() {
        return side1 * side1;
    }                                           // get functions and constructors
    public String getcColor() { return cColor; }
    //implementing the Shape interface functions:
    public int getID() {
        return ID;
    }
    public String toString() { return ("Square #"+ ID); }
    public String getKind()  {return "square";}
    public String getDetailString()
    {
        double perimeter = side1 *4;
        return "shape: Square, Color: " + getcColor() + " Area: " + getArea() +
                "perimeter " + perimeter;
    }
}
