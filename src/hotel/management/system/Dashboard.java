package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4;
    Dashboard(){
        mb=new JMenuBar();
        add(mb);
        m1=new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.BLACK);
        mb.add(m1);
        m2=new JMenu("ADMIN");
        m2.setForeground(Color.BLACK);
        mb.add(m2);
        i1=new JMenuItem("Reception");
        m1.add(i1);
        i1.addActionListener(this);
        i2=new JMenuItem("ADD EMPLOYEE");
        m2.add(i2);
        i2.addActionListener(this);
        i3=new JMenuItem("ADD ROOMS");
        m2.add(i3);
        i3.addActionListener(this);
        i4=new JMenuItem("ADD DRIVERS");
        m2.add(i4);
        i4.addActionListener(this);
        mb.setBounds(0, 0, 1950, 20);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/view 7.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0, 0, 1900, 700);
        add(l1);
        JLabel l2=new JLabel("Welcome to Majestic Crest,where elegance awaits");
        l2.setBounds(145, 70, 1100, 80);
        l1.add(l2);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Times New Roman" ,Font.ITALIC, 52));
        setLayout(null);//by default border layout hota
        setBounds(0, 0, 1950, 1000);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Reception")){
            new Reception().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD ROOMS")){
             new AddRooms().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD DRIVERS"))
            new AddDriver().setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
}
