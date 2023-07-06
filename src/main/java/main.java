import DAO.DBHelper;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        DBHelper dbHelper = new DBHelper();
        DBHelper.getConnection();
    }
}
