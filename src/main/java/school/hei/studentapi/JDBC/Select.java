package school.hei.studentapi.JDBC;

import school.hei.studentapi.models.Students;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Select {
    public static List<Students> getAllStudents(){
        Connection con = Connection.connect();
        String query = "SELECT * FROM students;";
        List<Students> result = new ArrayList<Students>();
        try{
            Statement stm = con.createStatement();
            ResultSet temp = stm.executeQuery(query);
            while(temp.next()){
                Long id = temp.getLong("id");
                String name = temp.getString("name");
                Students someone = new Students(id, name);
                result.add(someone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
