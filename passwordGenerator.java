import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class passwordGenerator extends JFrame{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(370,150,1200,750);
        Container cr=frame.getContentPane();
        cr.setLayout(null);
        JLabel label=new JLabel("Enter the length for the password");
        label.setBounds(200,100,800,70);
        label.setFont(new Font("Arial",Font.BOLD,50));
        cr.add(label);
        JTextField tfield=new JTextField();
        tfield.setBounds(400,200,350,50);
        tfield.setFont(new Font("Arial",Font.BOLD,30));
        cr.add(tfield);
        JButton btn=new JButton("Get Password");
        btn.setBounds(380,330,400,50);
        btn.setFont(new Font("Arial",Font.BOLD,25));
        cr.add(btn);
        JTextArea area=new JTextArea();
        area.setEditable(false);
        area.setLineWrap(true);
        JScrollPane spane=new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        spane.setBounds(50,400,1100,280);
        cr.add(spane);
        area.setFont(new Font("Arial",Font.BOLD,30));
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.setText(randomPassword(Integer.parseInt(tfield.getText())));
            }
        });
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static String randomPassword(int length){
        String password="";
        for(int x=0;x<length;x++){
            password+=String.valueOf((char)(new Random().nextInt(126-33)+33));
        }
        return password;
    }
}