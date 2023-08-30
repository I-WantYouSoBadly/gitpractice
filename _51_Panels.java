import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class _51_Panels {
    public static void main(String[] args) {
        //JPanel = a gui component that functions as a container to hld other components

        ImageIcon icon = new ImageIcon("typeshi.png");

        JLabel label = new JLabel();
        label.setText("Yo");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 0, 250, 250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,250,500,250);
        redpanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(777,777);
        frame.setVisible(true);
        redpanel.add(label);
        frame.add(greenpanel);
        frame.add(bluepanel);
        frame.add(redpanel);



    }
}
