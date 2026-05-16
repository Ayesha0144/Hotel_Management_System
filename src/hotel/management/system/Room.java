package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import net.proteanit.sql.*;
public class Room extends JFrame implements ActionListener{
    JTable t1;
    JButton b1,b2;
    Room(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/bedroom landscape 2.jpg"));
        JLabel l7=new JLabel(i1);
        l7.setBounds(510,3, 700, 500);
        add(l7);
    
        
        t1 = new JTable();
        t1.setBounds(0, 40, 500, 400);
        add(t1);
        
        JLabel l1 = new JLabel("Room Number");
        l1.setFont(new Font("Tahoma" ,Font.BOLD ,12));
        l1.setBounds(0, 10, 100 ,20);
        add(l1);
        
        JLabel l2 = new JLabel("Availablity");
        l2.setFont(new Font("Tahoma" ,Font.BOLD ,12));
        l2.setBounds(110, 10, 80 ,20);
        add(l2);//update rooms set status = 'Cleaned' where available = 'Available'; to update table
        
        JLabel l3 = new JLabel("Status");
        l3.setFont(new Font("Tahoma" ,Font.BOLD ,12));
        l3.setBounds(220, 10, 80 ,20);
        add(l3);
        
        JLabel l4 = new JLabel("Price");
        l4.setFont(new Font("Tahoma" ,Font.BOLD ,12));
        l4.setBounds(320, 10, 70 ,20);
        add(l4);
        
        JLabel l5 = new JLabel("Bed Type");
        l5.setFont(new Font("Tahoma" ,Font.BOLD ,12));
        l5.setBounds(410, 10, 100 ,20);
        add(l5);
        
        b1 = new JButton("Load Data");
        b1.setBounds(100, 460, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(250, 460, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(80,180,1250,550);
        setVisible(true);
    }
   public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
             try{
            Conn c = new Conn();
                 String str="Select * from rooms";
                 ResultSet rs = c.s.executeQuery(str);//uper wali sql statment say jo result niklay ga wo resultset class mn store hojaye ga
                 t1.setModel(DbUtils.resultSetToTableModel(rs));//to show table
             }
             catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
       
   } 
   public static void main(String[]args){
        new Room().setVisible(true);
    }
}
