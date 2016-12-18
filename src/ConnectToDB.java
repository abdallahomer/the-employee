
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectToDB {

    static Connection conn = null;
    static Statement stmt = null;

    public Statement connect(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database", "root", "123456789");
            stmt = conn.createStatement();
           
       
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
   return stmt;

}
}
