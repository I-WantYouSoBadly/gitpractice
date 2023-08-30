import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class _50_Labels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon ("typeshi.png");
        Border border = BorderFactory.createLineBorder(Color.cyan,3);

        JLabel label = new JLabel("Ambatukham");
        //label.setText("Ambatukham"); set label text in different way
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN,20));//set font of text
        label.setIconTextGap(-125);
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background golor
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon, text within label
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 0, 1000,1000);//set x and y position within frame as well as demention



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(569,569);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
