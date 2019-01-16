

public class Circle implements Shape {
    private int radius;     //data fields for a circle object
    private String cColor;
    private int ID;

    Circle() { radius = 0; cColor = "white";}
    Circle(String ID_, String r, String c ) {
        radius = Integer.parseInt(r);
        cColor = c;          //uses function of library "AWT color Factory" https://github.com/beryx/awt-color-factory/blob/master/README.md
        ID = Integer.parseInt(ID_);
    }
    public int getRadius() {
        return radius;
    }               // get functions and constructors
    public String getcColor() { return cColor; }
        //implementing the Shape class functions:
    public int getID() {
        return ID;
    }

    public String toString() { return ("circle #"+ ID); }
    public String getKind()  {return "Circle";}
    public String getDetailString()
    {
        double area = (radius * radius) * 3.14159;
        double circumference = 2 * 3.14159 * radius;
        return "shape: Circle\n Color: " + getcColor() + "\n radius: " + getRadius() +
         "\n area: " + area + "\n circumference: " + circumference;
    }



}
