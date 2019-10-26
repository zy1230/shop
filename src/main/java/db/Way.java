package db;

import object.Fruit;
import object.User;
import java.sql.*;

public class Way {
      public static User select(String name,String password) {
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet set = null;
        try {
            conn = DB.getConn();
            pre = conn.prepareStatement("select * from user where name =? and pass = ?");
            pre.setString(1,name);
            pre.setString(2,password);
            set = pre.executeQuery();
            while (set.next()){
                User user = new User();
                user.setName(set.getString(1));
                user.setPassword(set.getString(2));
                return user;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.release(set,pre,conn);
        }
            return null;
    }
   public static int insert(String name,String password){
        int a = 0;
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = DB.getConn();
            pre = conn.prepareStatement("insert into user values(?,?)");
            pre.setString(1,name);
            pre.setString(2,password);
            a = pre.executeUpdate();
            return a;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.release(null,pre,conn);
        }
            return a;
    }
   public static Fruit selectF(String name) {
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet set = null;
        try {
            Fruit fruit = new Fruit();
            conn = DB.getConn();
            pre = conn.prepareStatement("select * from fruit where name = ?");
            pre.setString(1,name);
            set = pre.executeQuery();
            while (set.next()) {
                fruit.setName(set.getString("name"));
                fruit.setPhoto(set.getString("photo"));
                fruit.setPrice(set.getDouble("price"));
            }
            return fruit;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.release(set, pre, conn);
        }
        return null;
    }
}
