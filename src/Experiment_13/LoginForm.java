import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener {

    JTextField t1;
    JPasswordField t2;
    JButton b;

    LoginForm(){

        setLayout(null);

        JLabel l1=new JLabel("Username");
        JLabel l2=new JLabel("Password");

        t1=new JTextField();
        t2=new JPasswordField();

        b=new JButton("Register");

        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100,30);

        t1.setBounds(150,50,100,30);
        t2.setBounds(150,100,100,30);

        b.setBounds(100,150,100,30);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b);

        b.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=
            DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "root"
            );

            PreparedStatement ps=
            con.prepareStatement(
            "insert into login values(?,?)"
            );

            ps.setString(1,t1.getText());

            ps.setString(2,
            String.valueOf(t2.getPassword()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
            this,"Registered Successfully"
            );

            con.close();

        }

        catch(Exception ex){
            System.out.println(ex);
        }

    }

    public static void main(String args[]){
        new LoginForm();
    }
}