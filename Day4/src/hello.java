import java.awt.*;
import javax.swing.*;

public class hello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("sum Example");

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField jTextField1 = new JTextField(10);
         JTextField jTextField2 = new JTextField(10);

         int One = 3;
         int Two = 5;

         int Sum = One +Two;

         jTextField1.setText(Integer.toString(Sum));
         jTextField2.setText(Integer.toString(Two)); 

         frame.add(new JLabel("sum:  "));
         frame.add(jTextField1);

         frame.add(new JLabel("two after increment: "));
         frame.add(jTextField1);

         frame.setVisible(true);


    }

    }
    

