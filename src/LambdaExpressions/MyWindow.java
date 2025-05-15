package LambdaExpressions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow {
    public static void main(String[] args) {

        JFrame frame=new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());


        //Create button and add jframe
        JButton button = new JButton("Click Me!!");

        //Using Anonymous Class

//       button.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               System.out.println("Button Click");
//               JOptionPane.showMessageDialog(null,"button is clicked");
//           }
//       });

        //Using LamdaExpression

        button.addActionListener((ActionEvent e)->{
            System.out.println("button click");
            JOptionPane.showMessageDialog(null,"Button Clicked using Lambda Expression");
        });

        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
