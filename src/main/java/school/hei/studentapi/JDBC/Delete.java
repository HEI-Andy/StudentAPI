package school.hei.studentapi.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static String deleteById(Long id){
        Connection con = Connection.connect();
        String query = "DELETE FROM students WHERE id =" + id + ";";
        try{
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Student.id=" + id + " was succefully deleted";
    }
}
