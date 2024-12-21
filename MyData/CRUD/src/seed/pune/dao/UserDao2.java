package seed.pune.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import seed.pune.bean.UserBean2;
import seed.pune.dbconnection.ConnectionProvider;

public class UserDao2 {

    private Connection conn;

    public UserDao2() {
    	conn = ConnectionProvider.getConnection();
    }

    public void addUser(UserBean2 userBean) {
        try {
        	String sql = "INSERT INTO users2(userid, firstname,lastname,mob)" +
    		" VALUES (?, ?, ? )";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, userBean.getId());
            ps.setString(2, userBean.getfName());
            ps.setString(3, userBean.getlName());   
            ps.setDate(4, new java.sql.Date(userBean.getDob().getTime()));
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUser(int userId) {
        try {
        	String sql = "DELETE FROM users2 WHERE userid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }

    public void editUser(UserBean2 userBean) {    	
    	try {
    		String sql = "UPDATE users2 SET firstname=?, lastname=?,mob=?" +
            " WHERE userid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(1, userBean.getfName());
            ps.setString(2, userBean.getlName());            
            ps.setInt(3, userBean.getId());
            ps.setDate(4, new java.sql.Date(userBean.getDob().getTime()));
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List getAllUsers() {
        List users = new ArrayList();
        try {
        	String sql = "SELECT * FROM users2";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean2 userBean = new UserBean2();
                userBean.setId(rs.getInt("userid"));
                userBean.setfName(rs.getString("firstname"));
                userBean.setlName(rs.getString("lastname")); 
                userBean.setDob(rs.getDate("mob"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public UserBean2 getUserById(int userId) {
    	UserBean2 userBean = new UserBean2();
        try {
        	String sql = "SELECT * FROM users2 WHERE userid=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	userBean.setId(rs.getInt("userid"));
            	userBean.setfName(rs.getString("firstname"));
            	userBean.setlName(rs.getString("lastname")); 
            	 userBean.setDob(rs.getDate("mob"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
}