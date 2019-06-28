package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao {

    private static Class dbClass;
    private final String URL = "jdbc:mysql://localhost:3306/USERCAR?serverTimezone=UTC";
    private final String USERNAME = "root";
    private final String PASS = "therootisonfire";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    protected Connection conn;

    public Dao() {
        this.Dao();
    }

    public Dao Dao() {
        this.registerDriver();
        return this;
    }

    public void registerDriver() {
        try {
            dbClass = Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    protected Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    protected void closeConnections(ResultSet rs, Statement st) {
        try {
            rs.close();
            st.close();
            conn.close(); //st.getConnection().close(); //samething
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void closeConnections(Statement st) {
        try {
            st.close();
            conn.close(); //st.getConnection().close(); //samething
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
