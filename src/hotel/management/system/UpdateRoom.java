package hotel.management.system;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
        
public class UpdateRoom extends JFrame implements ActionListener{
        Choice c1;
        JTextField t1,t2,t3;
        JButton b1, b2, b3;
        
    UpdateRoom(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/update.jpg"));
        JLabel l10=new JLabel(i1);
        l10.setBounds(370,0,900, 500);
        add(l10);
        
        
        JLabel l1=new JLabel("Update Room Status");
        l1.setBounds(80, 20, 250, 30);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma" ,Font.BOLD, 20));
        add(l1);
        
    
        JLabel l3 = new JLabel("Guest ID");
        l3.setBounds(30, 80, 120 ,20);
        add(l3);
        c1=new Choice();
        c1.setBackground(Color.WHITE);
        try{
        Conn c = new Conn();
                 String str="Select * from customer";
                 ResultSet rs = c.s.executeQuery(str);
                 while(rs.next()){
                     c1.add(rs.getString("number"));
                 }
                 
        }catch(Exception e){
        
            }
        c1.setBounds(200, 80, 150, 25);
        add(c1);
        
        
        JLabel l4 = new JLabel("Room Number");
        l4.setBounds(30, 130, 120 ,20);
        add(l4);
        t1 = new JTextField();
        t1.setBounds(200, 130, 150, 25);
        add(t1);
        
        
        JLabel l5 = new JLabel("Availability");
        l5.setBounds(30, 180, 120 ,20);
        add(l5);
        t2 = new JTextField();
        t2.setBounds(200, 180, 150, 25);
        add(t2);
        
        
        JLabel l6 = new JLabel("Clean Status");
        l6.setBounds(30, 230, 120 ,20);
        add(l6);
        t3 = new JTextField();
        t3.setBounds(200, 230, 150, 25);
        add(t3);
        b1 = new JButton("Check");
        b1.setBounds(130, 300, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Update");
        b2.setBounds(40, 350, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Back");
        b3.setBounds(220, 350, 120, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
        
        
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    setBounds(50,100,1300,550);
    setVisible(true);
    }
    Conn c = new Conn();
   
    
    public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==b1){
            String room = null;
          
            String s1 = c1.getSelectedItem();
            Conn c = new Conn();
            try{
              
                ResultSet rs = c.s.executeQuery("Select * from customer where number = '"+s1+"'");
                while(rs.next()){
                      
                    t1.setText(rs.getString("room"));
                    room = rs.getString("room");
                }
                ResultSet rs2 = c.s.executeQuery("Select * from rooms where room_number= '"+room+"'");
                while(rs2.next()){
                    t2.setText(rs2.getString("available"));
                 
                    t3.setText(rs2.getString("status"));
              
                }
                    
            }catch(Exception e){
                System.out.println(e);
            }
                    
                    }else if(ae.getSource()==b2){
                        try{
                       Conn c = new Conn(); 
                       String room = t1.getText();
                       String available = t2.getText();
                       String status = t3.getText();
                       String str = "update rooms set available = '"+available+"', status = '"+status+"' where room_number = '"+room+"'";
                       c.s.executeUpdate(str);
                       JOptionPane.showMessageDialog(null, "Room Updated Successfully");
                       new Reception().setVisible(true);
                       this.setVisible(false);
                        }catch (Exception e){
                            
                        }
            
        }else if(ae.getSource()==b3){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
     public static void main(String[]args){
     new UpdateRoom().setVisible(true);
}
}
