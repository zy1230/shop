package db;


import java.sql.*;
public class DB {
    private static String  user="root";
    private static String   password="root";
    private static String url="jdbc:mysql://localhost:3306/my?useUnicode=true&characterEncoding=utf8";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }


    public static void release(ResultSet set,Statement stmt,Connection conn){
        if(set!=null){
            try{
                set.close();
            }catch(SQLException e){

                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try{
                stmt.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        if(conn!=null){

            try{

                conn.close();

            }catch(SQLException e){

                e.printStackTrace();

            }
        }
    }
}
