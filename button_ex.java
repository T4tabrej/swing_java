// this shows the button Examples only

import javax.swing.*;
import java.net.URL;
import java.awt.Dimension;
import java.awt.event.*; 
public class button_ex  {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Button Example");

        //BUTTON WITHOUT TEXT
        JButton btn1=new JButton();
        btn1.setBounds(150,100,95,30);
        btn1.setText("click");
        frame.add(btn1);

         //BUTTON WITH TEXT
        JButton btn2=new JButton("Click Here");
        btn2.setBounds(150,135,95,30);
        frame.add(btn2);

           //BUTTON WITH Icon
        //    JButton btn3=new JButton();
           JButton btn3 = new JButton(new ImageIcon(((new ImageIcon("images.png")).getImage()).getScaledInstance(50, 20, java.awt.Image.SCALE_SMOOTH)));
           btn3.setBounds(150,165,95,30);
           frame.add(btn3);

        //adding event listner to button
        // btn3.addActionListener(new addActionListener(){
        //     public void actionPerformed(ActionEvent e){

        //     }
        // });
        JTextField tf=new JTextField(); 
        tf.setBounds(50,50, 100,20);  
        tf.setEditable(false);
        tf.setVisible(false);
        frame.add(tf);
        btn2.addActionListener(new ActionListener(){  
            // public void actionPerformed(ActionEvent e){  
            //             // tf.setText("Welcome to Javatpoint.");  
            //         }

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub
                tf.setText("clicked");
                tf.setVisible(true);
               

                
            }  
                });   


        //get text from button
        System.out.println( btn2.getText());

        // btn1.setEnabled(false);
    //    btn2.setIcon("java_swing/images.png");
       




        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
