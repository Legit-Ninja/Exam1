

public class Rectangle implements Shape {
    private int side1;              //data fields for a circle object
    private int side2;
    private String cColor;
    private int ID;

    Rectangle() { side1 = 0; side2 = 0; cColor = "white";}
    Rectangle(String ID_, String s, String c ) {
        side1 = Integer.parseInt(s);
        side2 = Integer.parseInt(s);
        cColor = c;
        ID = Integer.parseInt(ID_);
    }
    public int getArea() {
        return side1 * side2;
    }
                // get functions and constructors
    public String getcColor() { return cColor; }
    //implementing the Shape class functions:
    public int getID() {
        return ID;
    }

    public String toString() { return ("rectangle #"+ ID); }
    public String getKind()  {return "rectangle";}
    public String getDetailString()
    {
        double perimeter = side1 *2 + side2 *2;
        return "shape: Rectangle, Color: " + getcColor() + " Area: " + getArea() +
                  "perimeter " + perimeter;
    }
}
