package cn.oracle.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2015/6/7.
 */
public class DatabaseConnection {
    private static final String DBDRIVER="org.gjt.mm.mysql.Driver";
    private static final String DBURL="jdbc:mysql://localhost:3306/oracle";
    private static final String DBUSER="root";
    private static final String DBPASSWORD="root";
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
    public Connection getConnection(){
        return this.conn;
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

}
