import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class New {
    public static void main(String[] args) {
  
        JFrame frame = new JFrame("Simple Swing Example");

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JPanel panel = new JPanel();

       
        JLabel label = new JLabel("Hello, Swing!");
        panel.add(label);

        // Create a JButton and add an ActionListener to it
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
    
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame size and make it visible
        frame.setSize(1000, 200);
        frame.setVisible(true);
    }
}
