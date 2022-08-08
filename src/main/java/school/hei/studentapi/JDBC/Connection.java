package school.hei.studentapi.JDBC;


import school.hei.studentapi.models.Students;

import java.sql.*;
import java.util.List;

public abstract class Connection {
    public static Connection connect(){
        String url = "jdbc:postgresql://localhost:5432/student";
        String user ="postgres";
        String passwd = "root123";
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection(url, user, passwd);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public abstract List<Students> findAll();

    public PreparedStatement preparedStatement(String query) {
        return null;
    }

    public Statement createStatement() {
        return null;
    }

    public String Con() {
        return null;
    }
}
