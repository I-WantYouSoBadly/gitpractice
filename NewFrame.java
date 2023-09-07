import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame extends JFrame {
    JButton button;
    JLabel label;
    NewFrame(){
        ImageIcon icon = new ImageIcon("animobulet.jpg");
        ImageIcon icon2 = new ImageIcon("Omaygot.jpg");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(700, 700, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(1,1,500,500);
        button.addActionListener(e -> System.out.println("I need mo' boolet"));
        //button.addActionListener(e -> label.setVisible(true));
        button.setText("Come behind me I'll protect you");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(30);
        //button.setForeground((color.cyan));
        //button.setBackground
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,800);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }


}
