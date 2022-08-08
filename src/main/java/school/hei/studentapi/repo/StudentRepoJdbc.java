package school.hei.studentapi.repo;

import school.hei.studentapi.JDBC.Connection;
import school.hei.studentapi.models.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepoJdbc implements StudentRepo{
    Connection connex= new Connection() {
        @Override
        public List<Students> findAll() {
            return null;
        }
    };

    @Override
    public List<Students> findAll() {
        ResultSet rs;
        List<Students> students = new ArrayList<>();
        try (java.sql.Connection con = DriverManager.getConnection(connex.Con())) {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM students");
            rs = pst.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    @Override
    public List<Students> findWhereNameLike(String query) {
        return null;
    }

    @Override
    public Students add(Students student) {
        return null;
    }

    @Override
    public Students updateNameById(Long id, String newName) {
        return null;
    }

    @Override
    public String deleteById(Long id_student) {
        return null;
    }
}
