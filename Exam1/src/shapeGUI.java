/*
FEEDBACK

Read from the file correctly: 20/20%
Implement class hierarchy correctly: 20/20%
Populate appropriate data structures with shape data: 15/15%
Show list of shapes correctly: 15/15%
Show specific shape properties correctly: 10/15%
Well-structured, well-commented code: 13/15%


Comments:
  I don't see the images
  Shape doesn't need to define toString() since it's on Object
  Break reading the file into a separate class

*/

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class shapeGUI extends JFrame implements ActionListener
{
    private JPanel bigPanel;
    private JPanel detailPanel;
    private JTextField shapesTextField;
    private JTextField infoTextField;
    private JPanel shapeListPanel;
    private JTextField detail;
    private JPanel flowPanel;
    private ArrayList<Shape> shapes = new ArrayList<>();
    private ArrayList<JButton> buttons = new ArrayList<>();
    private JButton b;

    public void actionPerformed(ActionEvent e)
    {
        for (int i = 0; i < shapes.size(); i++)
        {
            if (e.getSource() == buttons.get(i))
            {
                detail.setText(shapes.get(i).getDetailString());
            }
        }
    }
    shapeGUI()
    {
        initialize();
        this.add(bigPanel);

    }
    public void initialize() {
        //JScrollPane listScroller = new JScrollPane(shapeListPanel);
        //listScroller.setPreferredSize(new Dimension(250, 80));
        //listScroller.setAlignmentX(LEFT_ALIGNMENT);
        shapeListPanel.setLayout(new BoxLayout(shapeListPanel,BoxLayout.Y_AXIS));
       // shapeListPanel.add(listScroller);
        GridBagConstraints c = new GridBagConstraints();
        String curdir = System.getProperty("user.dir");
        System.out.printf("\t%s\n", curdir);
        try (FileInputStream is = new FileInputStream("shapes.csv"))
        {
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(ir);
            String line = br.readLine();
            while (line != null) {
                 String[] parts = line.split(",");
                 for (int i = 0; i < parts.length; i++)
                     System.out.println(parts[i]);
                switch (parts[0]) {
                    case "triangle":
                        shapes.add(new Triangle(parts[1], parts[2], parts[3], parts[4], parts[5]));
                        b = new JButton((shapes.get(shapes.size()-1)).toString());        //makes a button in the interface to listen for clicking
                        buttons.add(b);
                        buttons.get(buttons.size()-1).addActionListener(this);
                    case "circle":
                        shapes.add(new Circle(parts[1], parts[2], parts[3]));
                        b = new JButton((shapes.get(shapes.size()-1)).toString());        //makes a button in the interface to listen for clicking
                        buttons.add(b);
                        buttons.get(buttons.size()-1).addActionListener(this);
                    case "rectangle":
                        for (int i = 0; i < parts.length; i++)
                            System.out.println(parts[i]);
                        shapes.add(new Rectangle(parts[1], parts[2], parts[3]));
                        b = new JButton((shapes.get(shapes.size()-1)).toString());        //makes a button in the interface to listen for clicking
                        buttons.add(b);
                        buttons.get(buttons.size()-1).addActionListener(this);
                    case "square":
                        shapes.add(new Square(parts[1], parts[2], parts[3]));       //makes a square object
                        b = new JButton((shapes.get(shapes.size()-1)).toString());        //makes a buton in the interface to listen for clicking
                        buttons.add(b);
                        buttons.get(buttons.size()-1).addActionListener(this);

                }
                line = br.readLine();
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        for (int i = 0; i < buttons.size(); i++) {//add buttons to the shapeList panel
            shapeListPanel.add(buttons.get(i));


        }
       // shapeListPanel.add(flowPanel);

    }

    public static void main(String[] args) {
        shapeGUI shape = new shapeGUI();
        shape.setSize(1280,720);
        shape.setVisible(true);
        shape.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
