package org.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.beans.UserLoginBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class UserLoginDaoImpl implements UserLoginDao {

	@Autowired(required = true)
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveUserLoginContent(UserLoginBeans userLoginBeans) {
		System.out.println("In Dao Class");
		String sql = "insert into usertable values(default,'" + userLoginBeans.getName() + "','"
				+ userLoginBeans.getEmail() + "','" + userLoginBeans.getPassword() + "','" + userLoginBeans.getMobNo()
				+ "')";
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<UserLoginBeans> viewUserLoginContent(UserLoginBeans userLoginBeans) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserLoginContent(UserLoginBeans userLoginBeans) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUserLoginContent(UserLoginBeans userLoginBeans) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int userLoginContent(UserLoginBeans userLoginBeans) {

		String sql = "select userId,email,password,userId from usertable where email=? and password=?";
		System.out.println("Sql query is " + sql);
		return jdbcTemplate.query(sql, new Object[] {userLoginBeans.getEmail(),userLoginBeans.getEmail()},new ResultSetExtractor<Integer>() {

					@Override
					public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
						int status = 0;
						
						while (rs.next()) {						
							userLoginBeans.setEmail(rs.getString(1));
							userLoginBeans.setPassword(rs.getString(2));
							status = rs.getInt("userId");
						}
						System.out.println("User Login Id is " + status);
						return status;
					}
				});

	}

	@Override
	public UserLoginBeans userSingleProfile(UserLoginBeans userLoginBeans) {
		String sql ="select * from usertable where userId = ?";
		return null;
	}

}
