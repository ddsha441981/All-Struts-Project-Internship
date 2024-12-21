package seed.pune.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import seed.pune.bean.UserBean;
import seed.pune.dbconnection.ConnectionProvider;

public class UserDao {

    private Connection conn;

    public UserDao() {
    	conn = ConnectionProvider.getConnection();
    }

    public void addUser(UserBean userBean) {
        try {
        	String sql = "INSERT INTO users(userid, firstname,lastname,mob,email,numroom,twomember,threemebr,mess,library,jim)" +
    		" VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, userBean.getId());
            ps.setString(2, userBean.getfName());
            ps.setString(3, userBean.getlName());  
            ps.setString(4, userBean.getTel()); 
            ps.setString(5, userBean.getEmail());
            ps.setString(6, userBean.getNumberofrooms());
            ps.setString(7, userBean.getTwomember());
            ps.setString(8, userBean.getThreemember());
            ps.setString(9, userBean.getCheck1());
            ps.setString(10, userBean.getCheck2());
            ps.setString(11, userBean.getCheck3());
            
            ps.executeUpdate();
            System.out.println("Record add"+userBean);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUser(int userId) {
        try {
        	String sql = "DELETE FROM users WHERE userid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }

    public void editUser(UserBean userBean) {    	
    	try {
    		String sql = "UPDATE users SET firstname=?, lastname=?, mob=?,email=?,numroom=?,twomember=?,threemebr=?,mess=?,library=?,jim=?" +
            " WHERE userid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(1, userBean.getfName());
            ps.setString(2, userBean.getlName());            
            ps.setInt(3, userBean.getId());
            ps.setString(4, userBean.getTel());
            ps.setString(5, userBean.getEmail());
            ps.setString(6, userBean.getNumberofrooms());
            ps.setString(7, userBean.getTwomember());
            ps.setString(8, userBean.getThreemember());
            ps.setString(9, userBean.getCheck1());
            ps.setString(10, userBean.getCheck2());
            ps.setString(11, userBean.getCheck3());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List getAllUsers() {
        List users = new ArrayList();
        try {
        	String sql = "SELECT * FROM users";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setId(rs.getInt("userid"));
                userBean.setfName(rs.getString("firstname"));
                userBean.setlName(rs.getString("lastname"));   
                userBean.setTel(rs.getString("mob"));
                userBean.setEmail(rs.getString("email"));
                userBean.setNumberofrooms("numroom");
                userBean.setTwomember(rs.getString("twomember"));
                userBean.setThreemember(rs.getString("threemebr"));
                userBean.setCheck1(rs.getString("mess"));
                userBean.setCheck2(rs.getString("library"));
                userBean.setCheck3(rs.getString("jim"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public UserBean getUserById(int userId) {
    	UserBean userBean = new UserBean();
        try {
        	String sql = "SELECT * FROM users WHERE userid=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	userBean.setId(rs.getInt("userid"));
            	userBean.setfName(rs.getString("firstname"));
            	userBean.setlName(rs.getString("lastname"));  
            	 userBean.setTel(rs.getString("mob"));
            	 userBean.setEmail(rs.getString("email"));
                 userBean.setNumberofrooms("numroom");
                 userBean.setTwomember(rs.getString("twomember"));
                 userBean.setThreemember(rs.getString("threemebr"));
                 userBean.setCheck1(rs.getString("mess"));
                 userBean.setCheck2(rs.getString("library"));
                 userBean.setCheck3(rs.getString("jim"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
}