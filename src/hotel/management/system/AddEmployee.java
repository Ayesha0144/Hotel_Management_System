package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AddEmployee extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1;
    AddEmployee(){
    
    JLabel name=new JLabel("NAME");
    name.setFont(new Font("serif" ,Font.ITALIC, 17));
    name.setBounds(60, 30, 120, 30);
    add(name);
    t1=new JTextField();
    t1.setBounds(200, 30, 150, 30);
    add(t1);
     JLabel age=new JLabel("AGE");
    age.setFont(new Font("serif" ,Font.ITALIC, 17));
    age.setBounds(60, 80, 120, 30);
    add(age);
    t2=new JTextField();
    t2.setBounds(200, 80, 150, 30);
    add(t2);
    JLabel gender=new JLabel("GENDER");
    gender.setFont(new Font("serif" ,Font.ITALIC, 17));
    gender.setBounds(60, 130, 120, 30);
    add(gender);
    r1 = new JRadioButton("MALE");
    r1.setFont(new Font("Tahoma" ,Font.PLAIN, 14));
    r1.setBounds(200, 130, 70, 30);
    r1.setBackground(Color.WHITE);
    add(r1);
    r2 = new JRadioButton("FEMALE");
    r2.setFont(new Font("Tahoma" ,Font.PLAIN, 14));
    r2.setBounds(270, 130, 99, 30);
    r2.setBackground(Color.WHITE);
    add(r2);
    JLabel job=new JLabel("JOB");
    job.setFont(new Font("serif" ,Font.ITALIC, 17));
    job.setBounds(60, 180, 120, 30);
    add(job);
    String str[]={"Front Desk Clerks","Porters","House keeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
    c1=new JComboBox(str);
    c1.setBounds(200, 180, 150, 30);
    c1.setBackground(Color.WHITE);
    add(c1);
    JLabel salary=new JLabel("SALARY");
    salary.setFont(new Font("serif" ,Font.ITALIC, 17));
    salary.setBounds(60, 230, 120, 30);
    add(salary);
    t3=new JTextField();
    t3.setBounds(200, 230, 150, 30);
    add(t3);
    JLabel phone=new JLabel("PHONE");
    phone.setFont(new Font("serif" ,Font.ITALIC, 17));
    phone.setBounds(60, 280, 120, 30);
    add(phone);
    t4=new JTextField();
    t4.setBounds(200, 280, 150, 30);
    add(t4);
    JLabel email=new JLabel("EMAIL");
    email.setFont(new Font("serif" ,Font.ITALIC, 17));
    email.setBounds(60, 330, 120, 30);
    add(email);
    
    t5=new JTextField();
    t5.setBounds(200, 330, 150, 30);
    add(t5);
    b1=new JButton("SUBMIT");
    b1.setBackground(Color.ORANGE);
    b1.setForeground(Color.BLACK);
    b1.setBounds(200, 390, 150, 30);
    b1.addActionListener(this);//to catch actionlistener or to perform action on button
    add(b1);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/employees.jpg"));
    JLabel l1=new JLabel(i1);
    l1.setBounds(380,10, 550, 500);
    add(l1);
    JLabel l2=new JLabel("Add Employee Details");
    l2.setBounds(130, 0, 700, 40);
    l2.setForeground(Color.ORANGE);
    l2.setFont(new Font("serif" ,Font.PLAIN, 35));
    l1.add(l2);
         getContentPane().setBackground(Color.WHITE);
    
    setLayout(null);
    setBounds(200,180,950,500);
    setVisible(true);
    }
    //we are overriding this method of actionlistener class so that error will be removed because this is an undeclared method in its class
    public void actionPerformed(ActionEvent ae){
        String name = t1.getText();
        String age = t2.getText();
        String salary = t3.getText();
        String phone = t4.getText();
        String email = t5.getText();
        String gender = null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String job=(String)c1.getSelectedItem();// we typecasted this method otherwise it gave us an object and we want in string so we typecasted it
        Conn c = new Conn();// to get connected with database
        String str ="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"')";
        
    
    try{//we are dealing with external database so there would be a chances of exception
       c.s.executeUpdate(str);//for ResultSet class we need to import a package import java.sql.* but in this case we dont need to store it because we are not matching text to database and in return we want nothing
       // we used execute Update because we need to update the table in our databse we are not inserting values in it for which we used execute quer
       JOptionPane.showMessageDialog(null, "New Employee Added");// it takes two arguments first one is giving warning and second one is invalid option
       this.setVisible(false);//closing current frame
       
        
    }catch(Exception e){
        
    
}
    }
    public static void main(String[] args) {
        new AddEmployee().setVisible(true);
    }
    
}
