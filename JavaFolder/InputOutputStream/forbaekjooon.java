package InputOutputStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

abstract class CreateRegisterForm extends JFrame implements ActionListener {
    public JTextField textField1, textField2;
    public CreateRegisterForm(){
        JPanel NewPanel;
        JLabel userRegLabel, passRegLabel;

        userRegLabel = new JLabel();
        userRegLabel.setText("your username here");

        textField1 = new JTextField(16);

        passRegLabel = new JLabel();
        passRegLabel.setText("your password here");

        textField2 = new JTextField(16);

        JButton b1 = new JButton("Sign Up");

        JPanel newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userRegLabel);
        newPanel.add(textField1);
        newPanel.add(passRegLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("Sign Up Form");

    }

    public void actionPerformed(ActionEvent e) {
        String userRegValue = textField1.getText();
        String passRegValue = textField2.getText();

        try{
            OutputStream output =  new FileOutputStream("C:/Users/kimjh/gitpractice/ATMwithJava/src/useraccountInfo.txt");
            String str1  = userRegValue;
            String str2  = passRegValue;
            byte[] by1=str1.getBytes();
            byte[] by2=str2.getBytes();
            output.write(by1);
            output.write(by2);


        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}
