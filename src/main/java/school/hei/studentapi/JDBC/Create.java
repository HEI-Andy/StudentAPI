package school.hei.studentapi.JDBC;


import school.hei.studentapi.models.Students;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {
    public static Students insertStudent(String name){
        Connection con = Connection.connect();
        String query = "Insert into students(name) values(?);";
        int i ;
        try{
            PreparedStatement stm = con.preparedStatement(query);
            i = stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
