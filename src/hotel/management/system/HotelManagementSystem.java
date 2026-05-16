package hotel.management.system;
import javax.swing.*;// for JFrame class
import java.awt.*;//for font
import java.awt.event.*;// for action listener
public class HotelManagementSystem extends JFrame implements ActionListener{
        HotelManagementSystem(){
        setBounds(300,200,736,414);
              
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/hotel1.jpg"));
    JLabel l1=new JLabel(i1);//directly image icon ko use nai kar skty frame mnr
    l1.setBounds(0, 0, 736, 414);
    add(l1);
    JLabel l2=new JLabel("Hotel Management System");
    l2.setBounds(127, 130, 736, 414);
    l2.setForeground(Color.ORANGE);
    l2.setFont(new Font("serif" ,Font.ITALIC, 45));
    l1.add(l2);
    JButton b1=new JButton("NEXT");
    b1.setBackground(Color.black);
    b1.setForeground(Color.yellow);
    b1.setBounds(630, 327, 80, 30);
    b1.addActionListener(this);
    l1.add(b1);

    setLayout(null);// by default border layout hota
    setVisible(true);

        }
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args) {
            new HotelManagementSystem();
             
       
    }
    
}
