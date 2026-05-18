import java.sql.*;

public class StudentCRUD {

    public static void main(String args[]) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
            "insert into student values(101,'Viraj',20)"
            );

            st.executeUpdate(
            "update student set age=21 where id=101"
            );

            ResultSet rs=
            st.executeQuery("select * from student");

            while(rs.next()){
                System.out.println(
                rs.getInt(1)+" "+
                rs.getString(2)+" "+
                rs.getInt(3));
            }

            st.executeUpdate(
            "delete from student where id=101"
            );

            con.close();
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}