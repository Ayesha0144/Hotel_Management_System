package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//to implement actionlistener
import java.sql.*;// to use resultSet class to store result
public class Login extends JFrame implements ActionListener{//there is an unimplemented method (action performed) in actionlistener so we need to override it 
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2;
    JPasswordField t2;
    
    Login(){
        l1=new JLabel("Username");
        l1.setBounds(40, 100, 100, 30);
        add(l1);
        l2=new JLabel("Password");
        l2.setBounds(40, 140, 100, 30);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(150, 100, 150, 30);
        add(t1);
        t2 = new JPasswordField();
        t2.setBounds(150, 140, 150, 30);
        add(t2);
        b1=new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40, 200, 120, 30);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(180, 200, 120, 30);
        b2.addActionListener(this);
        add(b2);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/person vector2.jpg"));
        JLabel l3=new JLabel(i1);
        l3.setBounds(325, 20, 236, 308);
        add(l3);
        getContentPane().setBackground(Color.WHITE);// to change the colour of frame
        
        setLayout(null);
        setBounds(350,200,600,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username = t1.getText();
            char [] passwordChars= t2.getPassword();
            String password = new String(passwordChars);
            Conn c = new Conn();
            String str = "Select* from login where username = '"+username+"' and password ='"+password+"'";
            try{
            ResultSet rs = c.s.executeQuery(str);//to extract values from databse we use executequery
            if (rs.next()){
                new Dashboard().setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "invalid username and password");
                this.setVisible(false);
            }
            }catch(Exception e){
                
            }
            
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
            
            }
    public static void main(String[] args) {
        new Login();
    }
}
