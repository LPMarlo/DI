package tema6;

import java.sql.*;

public class ScottConnector {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "root", "");
            String sql = "SELECT * FROM emp WHERE JOB = 'MANAGER'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(" __________________________");
            while (rs.next()) {
                System.out.println(" | " + rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | ");
                System.out.println(" __________________________");
            }
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
