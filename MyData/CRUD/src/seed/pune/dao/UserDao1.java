package seed.pune.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import seed.pune.bean.UserBean1;
import seed.pune.dbconnection.ConnectionProvider;

public class UserDao1 {

    private Connection conn;

    public UserDao1() {
    	conn = ConnectionProvider.getConnection();
    }

    public void addUser(UserBean1 userBean) {
        try {
        	String sql = "INSERT INTO users1(userid, firstname,email,message)" +
    		" VALUES (?, ?, ? ,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, userBean.getId());
            ps.setString(2, userBean.getfName());
            ps.setString(3, userBean.getlName());
            ps.setString(4, userBean.getMessage());
            ps.executeUpdate();
            System.out.println("insert"+userBean);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUser(int userId) {
        try {
        	String sql = "DELETE FROM users1 WHERE userid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }

    public void editUser(UserBean1 userBean) {    	
    	try {
    		String sql = "UPDATE users1 SET firstname=?, email=?, message=?" +
            " WHERE userid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(1, userBean.getfName());
            ps.setString(2, userBean.getlName());            
            ps.setInt(3, userBean.getId());
            ps.setString(4, userBean.getMessage());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List getAllUsers() {
        List users = new ArrayList();
        try {
        	String sql = "SELECT * FROM users1";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean1 userBean = new UserBean1();
                userBean.setId(rs.getInt("userid"));
                userBean.setfName(rs.getString("firstname"));
                userBean.setlName(rs.getString("email"));  
                userBean.setMessage(rs.getString("message"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public UserBean1 getUserById(int userId) {
    	UserBean1 userBean = new UserBean1();
        try {
        	String sql = "SELECT * FROM users1 WHERE userid=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	userBean.setId(rs.getInt("userid"));
            	userBean.setfName(rs.getString("firstname"));
            	userBean.setlName(rs.getString("email"));  
            	userBean.setMessage(rs.getString("message"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
}