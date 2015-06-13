package cn.oracle.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2015/6/13.
 */
public class DatabaseConnection {
    private static final String DBDRIVER="org.gjt.mm.mysql.Driver";
    private static final String DBURL="jdbc:mysql://localhost:3306/demo";
    private static final String DBUSER="root";
    private static final String DBPASSWORD="mysqladmin";
    private Connection conn;
    public DatabaseConnection(){
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn= DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void close(){
        if(this.conn!=null){
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public Connection getConnection(){
        return this.conn;
    }
}

