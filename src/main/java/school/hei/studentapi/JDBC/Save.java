package school.hei.studentapi.JDBC;

import school.hei.studentapi.models.Students;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Save {
    public static Students addStudent(String name){
        Connection con = Connection.connect();
        String query = "INSERT INTO students(name) VALUES ('" + name + "');";
        List<Students> result = new ArrayList<Students>();
        try{
            Statement stm = con.createStatement();
            int nb = stm.executeUpdate(query);
            InetAddress SelectbyName = null;
            result = (List<Students>) SelectbyName.getByName(name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return result.get(0);
    }
}
